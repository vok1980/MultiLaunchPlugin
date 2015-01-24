package com.voksoft.multilauncherplugin.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class LaunchConfigurationTabGroup extends
		AbstractLaunchConfigurationTabGroup {
	
	public LaunchConfigurationTabGroup() {
		
		setTabs( new ILaunchConfigurationTab[0] );
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
				
		ILaunchConfigurationTab[] tabs = getTabs();
		assert( tabs != null );
		

	}

}
