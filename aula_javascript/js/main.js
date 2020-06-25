
var nome = "Ilton Baracho";
var idade = 42;
var mais1Ano = idade + 1;
alert ("Bem vindo " + nome + ", você tem " + idade + " anos !");
alert ("Idade daqui a um ano = " + mais1Ano);

produtos = [
{
	nome: "Ilton",
	idade: 42,
	cargo: "Analista"
},
{
	nome: "Perão",
	idade: 43,
	cargo: "Gerente"	
},
{
	nome: "Kayo",
	idade: 28,
	cargo: "Assistente"
}
];
console.log(produtos);
console.log(produtos[2].nome);
console.log(produtos[2].cargo);
