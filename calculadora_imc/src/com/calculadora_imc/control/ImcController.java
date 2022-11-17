package com.calculadora_imc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.calculadora_imc.model.ImcBeam;
import com.calculadora_imcc.view.MainViewer;

public class ImcController implements ActionListener {
	private MainViewer context;
	public ImcBeam imc;
	public ImcController() {
	}	
	public ImcController(MainViewer context) {
		if (this.context == null) 
			this.context = context;
		}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	imc = new ImcBeam(context.getTextField().getText(), context.getTextField_1().getText());
	context.getTxtpnResultado().setText(imc.toString());
		
	}
}
