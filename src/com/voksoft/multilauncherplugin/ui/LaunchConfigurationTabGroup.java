package com.voksoft.multilauncherplugin.ui;

import org.eclipse.debug.ui.AbstractLaunchConfigurationTabGroup;
import org.eclipse.debug.ui.ILaunchConfigurationDialog;
import org.eclipse.debug.ui.ILaunchConfigurationTab;

public class LaunchConfigurationTabGroup extends
		AbstractLaunchConfigurationTabGroup {
	
	private enum TabIdxs {
		TI_COMMON,
		
		TI_COUNT,
	};

	public LaunchConfigurationTabGroup() {
		ILaunchConfigurationTab[] tabs = getTabs();
		assert( tabs == null );
		
		tabs = new ILaunchConfigurationTab[ TabIdxs.TI_COUNT.ordinal() ];
		tabs[TabIdxs.TI_COMMON.ordinal()] = new org.eclipse.debug.ui.CommonTab();
		
		setTabs(tabs);
	}

	@Override
	public void createTabs(ILaunchConfigurationDialog dialog, String mode) {
				
		ILaunchConfigurationTab[] tabs = getTabs();
		assert( tabs != null );
		
		dialog.setActiveTab( tabs[ TabIdxs.TI_COMMON.ordinal() ] );		

	}

}
