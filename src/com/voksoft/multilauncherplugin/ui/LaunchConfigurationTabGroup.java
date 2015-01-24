package com.voksoft.multilauncherplugin.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class LaunchConfigurationTabGroup extends
		AbstractLaunchConfigurationTabGroup {

	public LaunchConfigurationTabGroup() {
		ILaunchConfigurationTab[] tabs = getTabs();
		assert( tabs == null );
		
		tabs = new ILaunchConfigurationTab[1];
		tabs[0] = new org.eclipse.debug.ui.CommonTab();
		
		setTabs(tabs);
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
		
		int a = 56;
		a ++;
		
		ILaunchConfigurationTab[] tabs = getTabs();
		assert( tabs != null );
		
		dialog.setActiveTab( tabs[0] );		

	}

}
