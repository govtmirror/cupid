package org.eclipsecon.swtbot.example;

import static org.eclipse.swtbot.swt.finder.SWTBotAssert.assertTextContains;
import static org.eclipse.swtbot.swt.finder.waits.Conditions.shellCloses;
import static org.hamcrest.Matchers.instanceOf;

import org.eclipse.swt.custom.StyledText;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.Widget;
import org.eclipse.swtbot.eclipse.finder.SWTEclipseBot;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotEclipseEditor;
import org.eclipse.swtbot.eclipse.finder.widgets.SWTBotView;
import org.eclipse.swtbot.swt.finder.junit.SWTBotJunit4ClassRunner;
import org.eclipse.swtbot.swt.finder.utils.FileUtils;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotShell;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotStyledText;
import org.eclipse.swtbot.swt.finder.widgets.SWTBotTree;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.osgi.framework.Bundle;

@RunWith(SWTBotJunit4ClassRunner.class)
public class MyFirstTest {

	private static SWTEclipseBot bot;

	@BeforeClass
	public static void beforeClass() throws Exception {
		bot = new SWTEclipseBot();
		bot.view("Welcome").close();
	}

	@AfterClass
	public static void sleep() {
		bot.sleep(5000);
	}

	@AfterClass
	public static void afterClass() throws Exception {
		SWTBotView packageExplorerView = bot.view("Package Explorer");
		packageExplorerView.show();
		Composite packageExplorerComposite = (Composite) packageExplorerView.getWidget();

		Tree swtTree = (Tree) bot.widget(instanceOf(Tree.class), packageExplorerComposite);

		SWTBotTree tree = new SWTBotTree(swtTree);

		tree.select("MyFirstProject");

		bot.menu("Edit").menu("Delete").click();

		// the project deletion confirmation dialog
		SWTBotShell shell = bot.shell("Delete Resources");
		shell.activate();
		bot.checkBox("Delete project contents on disk (cannot be undone)").select();
		bot.button("OK").click();
		bot.waitUntil(shellCloses(shell));
	}

	@Test
	public void canCreateANewJavaProject() throws Exception {
		bot.menu("File").menu("New").menu("Project...").click();

		bot.shell("New Project").activate();
		bot.tree().select("Java Project");
		bot.button("Next >").click();

		bot.textWithLabel("Project name:").setText("MyFirstProject");

		bot.button("Finish").click();

		assertProjectCreated();
	}

	private void assertProjectCreated() {
		// Copied from #afterClass()
		// FIXME: remove duplication
		SWTBotView packageExplorerView = bot.view("Package Explorer");
		packageExplorerView.show();
		Composite packageExplorerComposite = (Composite) packageExplorerView.getWidget();

		Tree swtTree = (Tree) bot.widget(instanceOf(Tree.class), packageExplorerComposite);

		SWTBotTree tree = new SWTBotTree(swtTree);
		// throws WNFE if the item does not exist
		tree.getTreeItem("MyFirstProject");
	}
	
	@Test
	public void canCreateANewJavaClass() throws Exception {
		bot.toolbarDropDownButtonWithTooltip("New Java Class").menuItem("Class").click();

		bot.shell("New Java Class").activate();
		bot.textWithLabel("Source folder:").setText("MyFirstProject/src");

		bot.textWithLabel("Package:").setText("org.eclipsecon.project");
		bot.textWithLabel("Name:").setText("HelloWorld");

		bot.button("Finish").click();

		// FIXME: assert that the class is actually created, for later
	}

	@Test
	public void canTypeInTextInAJavaClass() throws Exception {
		Bundle bundle = Activator.getDefault().getBundle();
		String contents = FileUtils.read(bundle.getEntry("test-files/HelloWorld.java"));
		SWTBotEclipseEditor editor = bot.editor("HelloWorld.java");
		editor.setText(contents);
		editor.save();

		// FIXME: verify that the text is actually placed in the editor
	}

	@Test
	public void canExecuteJavaApplication() throws Exception {
		bot.menu("Run").menu("Run").click();

		// FIXME, get rid of sleep
		bot.sleep(5000);
		SWTBotView view = bot.view("Console");
		Widget consoleViewComposite = view.getWidget();

		StyledText swtStyledText = (StyledText) bot.widget(instanceOf(StyledText.class), consoleViewComposite);
		SWTBotStyledText styledText = new SWTBotStyledText(swtStyledText);

		assertTextContains("Hello World", styledText);
	}

}
