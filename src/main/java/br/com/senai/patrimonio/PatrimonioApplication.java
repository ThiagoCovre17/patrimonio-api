package br.com.senai.patrimonio;

import br.com.senai.patrimonio.model.*;
import br.com.senai.patrimonio.model.enums.Cargo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {

		SpringApplication.run(PatrimonioApplication.class, args);

		Empresa empresa = new Empresa();
		empresa.setRazaoSocial("Senai LTDA");
		System.out.println(empresa.getRazaoSocial());




		Endereco endereco=new Endereco();
		endereco.setRua("Bela vista");
		System.out.println(endereco.getRua());
		endereco.setBairro("vila rica");
		System.out.println(endereco.getBairro());

		empresa.setEndereco(endereco);
		System.out.println(empresa.getEndereco().getRua());

		Endereco enderecoComArgumentos= new Endereco();
		endereco.setNumero("Casa 420");
		System.out.println(endereco.getNumero());


	Pessoa pessoa=new Pessoa( );
	Sala sala =new Sala();

		Funcionario funcionario=new Funcionario(

				35L , "Thiago", "123456",
				Cargo.GERENTE,empresa,sala
		);

		System.out.println(funcionario.getCpf());




	}



}

