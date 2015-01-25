package com.voksoft.multilauncherplugin.ui;

import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;
import org.eclipse.swt.widgets.Text;



public class LaunchConfigurationTabMain extends AbstractLaunchConfigurationTab {

	private Button m_addButton;
	private Button m_removeButton;
	
	@Override
	public void createControl(Composite parent) {
		Font font = parent.getFont();
		
		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);
		GridLayout topLayout = new GridLayout();
		topLayout.verticalSpacing = 0;
		topLayout.numColumns = 2;
		comp.setLayout(topLayout);
		comp.setFont(font);
		
//		createVerticalSpacer(comp, 3);
		
		Table table = new Table(comp, SWT.BORDER | SWT.V_SCROLL);
		
		GridData gd = new GridData(GridData.FILL_BOTH);
		table.setLayoutData(gd);		
		
		table.setLinesVisible (true);
		table.setHeaderVisible (true);
				
//		table.getColumnCount();
		
		String[] titles = {"Name", "Mode"};
		for (int i=0; i<titles.length; i++) {
			TableColumn column = new TableColumn (table, SWT.CENTER);
			column.setText (titles [i]);
		}	
		
		for (int i=0; i<4; i++) {
			TableItem item = new TableItem (table, SWT.NONE);
			item.setText (0, "Item " + i);
			item.setText (1, "Item2 " + i);
			
	//		TableItem item2 = new TableItem (table, 1);
		//	item2.setText ("Item 2 " + i);
		}

		table.setFont(font);
		
		for (int i=0; i<titles.length; i++) {
			table.getColumn (i).pack ();
		}
		
//		Label programLabel = new Label(comp, SWT.NONE);
//		programLabel.setText("&Program:");
//		GridData gd = new GridData(GridData.BEGINNING);
//		programLabel.setLayoutData(gd);
//		programLabel.setFont(font);
//		
//		fProgramText = new Text(comp, SWT.SINGLE | SWT.BORDER);
//		gd = new GridData(GridData.FILL_HORIZONTAL);
//		fProgramText.setLayoutData(gd);
//		fProgramText.setFont(font);
//		fProgramText.addModifyListener(new ModifyListener() {
//			public void modifyText(ModifyEvent e) {
//				updateLaunchConfigurationDialog();
//			}
//		});
				
		
		m_addButton = createPushButton(comp, "&Add", null); 
		m_addButton.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
			//	browsePDAFiles();
			}
		});
		
		m_removeButton = createPushButton(comp, "&Remove", null); 
		
		GridData gdAdd = new GridData(GridData.HORIZONTAL_ALIGN_END);
		GridData gdRemove = new GridData(GridData.END);
		gdRemove.horizontalAlignment = GridData.END;
		m_addButton.setLayoutData(gdAdd);
		m_removeButton.setLayoutData(gdAdd);
				
	}

	@Override
	public void setDefaults(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initializeFrom(ILaunchConfiguration configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void performApply(ILaunchConfigurationWorkingCopy configuration) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return "&Launches";
	}

}
