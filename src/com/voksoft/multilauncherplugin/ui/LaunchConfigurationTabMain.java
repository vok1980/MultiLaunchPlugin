package com.voksoft.multilauncherplugin.ui;


import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchConfigurationWorkingCopy;
import org.eclipse.debug.ui.AbstractLaunchConfigurationTab;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Font;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.TableColumn;
import org.eclipse.swt.widgets.TableItem;

import com.voksoft.multilauncherplugin.ui.SelectConfigDialog;


public class LaunchConfigurationTabMain extends AbstractLaunchConfigurationTab {

	private Button m_addButton;
	private Button m_removeButton;
	
	@Override
	public void createControl(Composite parent) {
		Font font = parent.getFont();
		
		Composite comp = new Composite(parent, SWT.NONE);
		setControl(comp);
		
		FormLayout layout = new FormLayout();
		layout.marginHeight = 5;
		layout.marginWidth = 5;
		
		comp.setLayout(layout);
		comp.setFont(font);
		
		Table table = new Table(comp, SWT.BORDER | SWT.V_SCROLL);		
		table.setLinesVisible (true);
		table.setHeaderVisible (true);
				
		m_addButton = new Button(comp, SWT.PUSH); 
		m_addButton.setText("&Add");	
		m_removeButton = new Button(comp, SWT.PUSH); 
		m_removeButton.setText("&Remove");
		
		FormData formDataAddBtn = new FormData();
		formDataAddBtn.width = 100;
		formDataAddBtn.top = new FormAttachment(0, 0);
		formDataAddBtn.right = new FormAttachment(100, -3);
		m_addButton.setLayoutData(formDataAddBtn);
		
		FormData formDataRemoveBtn = new FormData();
		formDataRemoveBtn.width = formDataAddBtn.width;
		formDataRemoveBtn.top = new FormAttachment(m_addButton, 5);
		formDataRemoveBtn.right = new FormAttachment(100, -3);
		m_removeButton.setLayoutData(formDataRemoveBtn);
		
		FormData formDataTable = new FormData();
		formDataTable.top = new FormAttachment(0, 0);
		formDataTable.left = new FormAttachment(0, 0);		
		formDataTable.bottom = new FormAttachment(100,-5);
		formDataTable.right = new FormAttachment(m_addButton, -7, SWT.LEFT);
		
		table.setLayoutData(formDataTable);		
		
		m_addButton.addSelectionListener ( new SelectionAdapter()
		{
			public void widgetSelected(SelectionEvent e) {
				new SelectConfigDialog( getShell() ) {
					
				}.open() ;				
			}
		});
		
		String[] titles = {"Name", "Mode"};
		for (int i = 0; i < titles.length; i++) {
			TableColumn column = new TableColumn (table, SWT.CENTER);
			column.setText (titles[i]);
		}	
		
		for (int i=0; i<4; i++) {
			TableItem item = new TableItem (table, SWT.NONE);
			item.setText (0, "Item " + i);
			item.setText (1, "Item2 " + i);
		}

		table.setFont(font);
		
		for (int i = 0; i < titles.length; i++) {
			table.getColumn (i).pack ();
		}
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
