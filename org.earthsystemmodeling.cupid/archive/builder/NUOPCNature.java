package org.earthsystemmodeling.cupid.builder;

import java.util.HashMap;
import java.util.Map;

import org.earthsystemmodeling.FSM;
import org.earthsystemmodeling.cupid.nuopc.NUOPCApplication;
import org.eclipse.core.resources.ICommand;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.IProjectNature;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.ui.IMarkerResolution;

public class NUOPCNature implements IProjectNature {

	/**
	 * ID of this project nature
	 */
	public static final String NATURE_ID = "org.earthsystemmodeling.cupid.nuopcNature";

	private IProject project;
	
	//public NUOPCApplication reversedModel;
	//public Map<Object, Object> reversedMappings;
	//public NUOPCApplication forwardModel;
	
	public FSM<?> fsm;
	public FSM<?> fsmForward;
	
	public Map<IMarker, IMarkerResolution> markerFixes = new HashMap<IMarker, IMarkerResolution>();
	
	//private NUOPCApplication reverseEngineeredModel;
	//private ReverseEngineer reverseEngineer;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#configure()
	 */
	public void configure() throws CoreException {
		IProjectDescription desc = project.getDescription();
		ICommand[] commands = desc.getBuildSpec();

		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(NUOPCBuilder.BUILDER_ID)) {
				return;
			}
		}

		ICommand[] newCommands = new ICommand[commands.length + 1];
		System.arraycopy(commands, 0, newCommands, 0, commands.length);
		ICommand command = desc.newCommand();
		command.setBuilderName(NUOPCBuilder.BUILDER_ID);
		newCommands[newCommands.length - 1] = command;
		desc.setBuildSpec(newCommands);
		project.setDescription(desc, null);
		
		//System.out.println("Added NUOPC project nature");

	}
	
	public static void addNUOPCNature(IProject p, IProgressMonitor monitor) throws CoreException {
		IProjectDescription projectDesc = p.getDescription();
	    String[] prevNatures = projectDesc.getNatureIds();
	    String[] newNatures = new String[prevNatures.length + 1];
	    System.arraycopy(prevNatures, 0, newNatures, 0, prevNatures.length);
	    newNatures[prevNatures.length] = NUOPCNature.NATURE_ID;
	    projectDesc.setNatureIds(newNatures);
	    p.setDescription(projectDesc, monitor);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#deconfigure()
	 */
	public void deconfigure() throws CoreException {
		IProjectDescription description = getProject().getDescription();
		ICommand[] commands = description.getBuildSpec();
		for (int i = 0; i < commands.length; ++i) {
			if (commands[i].getBuilderName().equals(NUOPCBuilder.BUILDER_ID)) {
				ICommand[] newCommands = new ICommand[commands.length - 1];
				System.arraycopy(commands, 0, newCommands, 0, i);
				System.arraycopy(commands, i + 1, newCommands, i,
						commands.length - i - 1);
				description.setBuildSpec(newCommands);
				project.setDescription(description, null);			
				return;
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#getProject()
	 */
	public IProject getProject() {
		return project;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.resources.IProjectNature#setProject(org.eclipse.core.resources.IProject)
	 */
	public void setProject(IProject project) {
		this.project = project;
	}

	

	
}
