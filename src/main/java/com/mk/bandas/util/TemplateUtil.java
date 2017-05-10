package com.mk.bandas.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map.Entry;

import org.apache.commons.io.FileUtils;

import com.google.common.base.Charsets;

/**
 * Classe utilitária para auxiliar na montagem de arquivos baseados em modelos (templates)
 */
public class TemplateUtil {

	/**
	 * Método que processa o arquivo de template, substituindo os valores de parametros passados
	 * no arquivo de modelo, e devolvendo o texto processado.
	 * </br>
	 * Para criar um template no arquivo, basta colocar um texto envolto por ## ## .<br/>  
	 * Ex: ##data_envio##, ##nome_solicitante## <br/>
	 * Salve o arquivo em resources na pasta 'templates'.
	 * 
	 * @param nomeTemplate nome do arquivo de template localizado na pasta templates em resources
	 * que será utilizado
	 * 
	 * @param parametros é um hashmap que contém os nomes de parametros (strings) e os respectivos valores (strings) que serão
	 * substituídos no template. <br/>
	 * Ex de criação de parametros: <br/>
	 *  HashMap<String, String> parametros = new HashMap<String, String>(); <br/> 
	 *  parametros.put("identificacao_ocorrencia", objeto.getId().toString());<br/>
	 *  parametros.put("nome_solicitante", objeto.getNomeSolicitante());<br/>
	 * @throws Exception 
	 * 
	 */	
	public String processarTemplate(String nomeTemplate, HashMap<String, String> parametros) throws Exception {
		String resultado = getTemplate(nomeTemplate);

		//subsitui todos os valores de parametros passados no template
		for (Entry<String, String> item : parametros.entrySet()) {
			resultado = resultado.replace("##" + item.getKey() + "##", item.getValue());
		}
		
		return resultado;
	}

	private String getTemplate(String nomeTemplate) throws Exception  {
		String result;
		File file;
		URL url = getClass().getResource("/" + nomeTemplate);

		try {
			file = new File(url.toURI());
			byte[] encoded = FileUtils.readFileToByteArray(file);
			result = new String(encoded, Charsets.UTF_8);

		} catch (URISyntaxException e1) {
			throw new Exception("Erro ao ler arquivo de template");
		} catch (IOException e) {
			throw new Exception("Erro ao ler arquivo de template");
		}

		return result;
	}

}
