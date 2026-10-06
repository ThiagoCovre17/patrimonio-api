package br.com.senai.patrimonio;

import br.com.senai.patrimonio.atividade2.Desenvolvedor;
import br.com.senai.patrimonio.atividade2.Gerente;
import br.com.senai.patrimonio.atividades.Computadores;
import br.com.senai.patrimonio.atividades.Equipamento;
import br.com.senai.patrimonio.atividades.Veiculo;
import br.com.senai.patrimonio.avaliacao.Evento;
import br.com.senai.patrimonio.avaliacao.Participante;
import br.com.senai.patrimonio.avaliacao.enums.Nivel;
import br.com.senai.patrimonio.avaliacao.enums.Status_evento;
import br.com.senai.patrimonio.model.*;
import br.com.senai.patrimonio.model.enums.Cargo;
import br.com.senai.patrimonio.model.enums.EstadoConservacao;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatrimonioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatrimonioApplication.class, args);

		Participante participante = new Participante("Thiago", "thiago08covre@gmai.com", "123456789",
				"P001", Nivel.NIVEL_INTERMEDIARIO);
		System.out.println("Nome: " + participante.getNome());
		System.out.println("Email: " + participante.getEmail());
		System.out.println("Telefone: " + participante.getTelefone());
		System.out.println(participante.getMatricula());
		System.out.println(participante.getNivel());

		Evento evento = new Evento(1, "Feira de tecnologia",
				"vila Rica", participante);
		System.out.println("Codigo: " + evento.getCodigo());
		System.out.println("Nome: " + evento.getNome());
		System.out.println("Local: " + evento.getLocal());
		System.out.println("Responsavel: " + participante.getNome());
		System.out.println(Status_evento.EVENTO_EM_ANDAMENTO);

		Empresa empresaInterface = new Empresa();

		Bloco blocoInterface = new Bloco(1L, " Bloco 2", empresaInterface);
		Sala salaInterface = new Sala(2L, " Lab 28", " 45678",
				blocoInterface, empresaInterface);


		System.out.println(salaInterface.getDescricaoLocalizavel());


		Bem bem = new Bem();
		System.out.println(bem.getEmpresaVinculada());

		Empresa empresa1 = new Empresa();
		bem.setEmpresa(empresa1);
		System.out.println(bem.getEmpresaVinculada());

		empresa1.setNome("Senai");
		System.out.println(bem.getEmpresaVinculada());

		System.out.println("Teste dos Blocos");
		Bloco bloco = new Bloco();
		System.out.println(bloco.getEmpresaVinculada());

		bloco.setEmpresa(empresa1);
		System.out.println(bloco.getEmpresaVinculada());

		System.out.println("Teste da sala");
		Sala sala1 = new Sala();
		System.out.println(sala1.getEmpresaVinculada());
		sala1.setEmpresa(empresa1);
		System.out.println(sala1.getEmpresaVinculada());

		System.out.println("Teste de funcionario");
		Funcionario funcionario1 = new Funcionario();
		System.out.println(funcionario1.getEmpresaVinculada());

		funcionario1.setEmpresa(empresa1);
		System.out.println(funcionario1.getEmpresaVinculada());

		Pessoa pessoa = new Pessoa();

		pessoa.setNome("Joãozinho");
		pessoa.setCpf("456789102");
		funcionario1.setCargo(Cargo.GERENTE);
		System.out.println(pessoa.getIdentificacao());

		funcionario1.setNome("Mariazinha");
		funcionario1.setCpf("12345678");
		funcionario1.setCargo(Cargo.ESTAGIARIO);
		System.out.println(funcionario1.getIdentificacao());



		Equipamento equipamento = new Equipamento("Impressora", 1000);
		Equipamento computador = new Computadores("Computador", 3000);
		Equipamento veiculo = new Veiculo("Carro", 50000);

		exibirRelatorio(equipamento);
		exibirRelatorio(computador);
		exibirRelatorio(veiculo);

		br.com.senai.patrimonio.atividade2.Funcionario funcionario = new br.com.senai.patrimonio.atividade2.Funcionario("Thiago", 50000.00);
		br.com.senai.patrimonio.atividade2.Funcionario gerente = new Gerente("Thiago",1234.00);
		br.com.senai.patrimonio.atividade2.Funcionario desenvolvedor = new Desenvolvedor("Thiago", 500000);

		imprimirContraCheque(funcionario);
		imprimirContraCheque(gerente);
		imprimirContraCheque(desenvolvedor);
	}


	public static void exibirRelatorio(Equipamento item) {


		System.out.println("Item: " + item.getNome());
		System.out.println("Valor Inicial: R$ " + item.getValorInicial());
		System.out.println("Depreciação: R$ " + item.calcularDepreciacao());

		System.out.println("-------------------------------------------");


	}
	public static void imprimirContraCheque(br.com.senai.patrimonio.atividade2.Funcionario f){
		System.out.println("Funcionario: " +  f.getNome());
		System.out.println("Sálario Base R$:" +  f.getSalarioBase());
		System.out.println ("Bonificação: R$ " + f.calcularBonificacao() );

		System.out.println("-------------------------------------------");


	}
}

