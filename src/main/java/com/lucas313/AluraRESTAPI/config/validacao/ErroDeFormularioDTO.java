package com.lucas313.AluraRESTAPI.config.validacao;

public class ErroDeFormularioDTO {
	
	private String campo;
	private String erro;
	public ErroDeFormularioDTO(String campo, String erro) {
		super();
		this.campo = campo;
		this.erro = erro;
	}
	public String getCampo() {
		return campo;
	}
	
	public String getErro() {
		return erro;
	}
	
}
