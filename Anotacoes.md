# Anotacoes Spring

Classe de configuração
São classes utilizadas para customização e configuração da aplicação na classe de configuração
não é inserido blocos de logicas de programação.
dentro dessa classe é utilizada a anotation

**@Configiguration

Quando anotada a classe com a anotação "@Configiguration" ela passa a ser escaneada pelo spring boot como uma classe de configuração
e vai aplicar as configurações de configurações que estão dentro dela na aplicação.
Essas configurações são setas atraves de uma anotation @BEAN, são utilizados para realizar a configuração da aplicação.


Classe application.Properties classe de configurações diretas sem ter que criar ou utilizar BEan 
passando o value sendo que varias propriedades podem ser especificadas nesse arquivos todos os tipos de arquivos


todas as as anotations se referenciam a a anotation @Component;

**@Profile:
utilizado para criação de perfis na classe de configurations o
COMANDlINERUNNER nada mais é do que um codigo que funciona da seguinte forma quando a aplicação subir o spring vai procurar todos os @Beans e ao encontrar ira executar todos os codigos dentro do comandlineRuner como se fosse um codigo que executa quando a aplicação inicializa.

O arquivo  aplication.properties possibilita inserir configurações de validação de configuração de ambiente possibilitando configurar acesso de perfis de acesso.( utilizado em configurações de email, e banco de dados);


Rest com JPA

@ID - identifica qual é a primarikey da tabela gerada pelo jpa quando escaneada uma entidade com a anotation @Entity deve ter ao menos 1 id.
@GeneratedValue referencia a maneira de geração de id do JPA
@Column gera e identifica a coluna do banco de dados referente ao mapeamento.
@EntityManager- ELe é resposável por fazer todas as operações com a entidade dentro dessa classe é possivel chamar outras operações.

**Anotations dos Controladores Rest

@Controller 
@Responsebody
@RestController


@RequestMapping
Define a url base para que a aplicação seja encontrada, ou seja toda a requisição depende de um endpoint com essa anotation é basicamente identificada a rota ou o endpoint.È possivel receber parametros nos endopoint com para isso basta incluir no (@RequestMapping) um value ficando dessa maneira como exemplo: @RequestMapping(value"/hello/{NOME}<-- dentro desta chaves passa o parametro da requisição, dentro dele é identificado qual é o verbo http que vai acessar esse método.Essa identificação é realizada atravez do (method = RequestMethod.(otipodarequisição, GET, PUT, DELETE etc.)

@PathVariable você define que esta recebendo uma variavel como parãmentro o path é o valor dentro do value da anotation @RequestMapping.



