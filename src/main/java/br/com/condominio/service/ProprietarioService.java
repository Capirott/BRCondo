package br.com.condominio.service;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;

import br.com.condominio.dao.ProprietarioDAO;
import br.com.condominio.model.Proprietario;
import br.com.condominio.util.Transacional;


public class ProprietarioService implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private ProprietarioDAO proprietarioDAO;
	
	@Transacional
	public void save(Proprietario proprietario){
		proprietarioDAO.save(proprietario);
	}
	
	public List<Proprietario> listarTodos(){
		return proprietarioDAO.listar(Proprietario.class);
	}	
	
	public List<Proprietario> listAllByNome(String nome){
		return proprietarioDAO.listAllByNome(nome);
	}
	
	@Transacional
	public void excluir(Proprietario proprietario){
		proprietarioDAO.excluir(proprietario);
	}
	
	public Proprietario consultarPorId(Long id){
		return proprietarioDAO.consultar(Proprietario.class, id);
	}
}
