# Word

 Estou projetando e construindo um aplicativo usando os componentes
 de arquitetura Room, ViewModel e LiveData. 

Implementando a arquitetura recomendada usando os componentes
de arquitetura do Android.

Trabalho com um banco de dados para obter e salvar dados e 
preencher previamente o banco de dados com palavras de amostra.
Exibo todas as palavras em a RecyclerViewna MainActivityclasse.

Abrindo uma segunda atividade quando o usuário toca no botão +. 

Quando o usuário insere uma palavra, essa palavra é adicionada
ao banco de dados e exibida na RecyclerViewlista.

<img width="500" alt="Screen Shot 2021-05-16 at 16 24 43" src="https://user-images.githubusercontent.com/49947803/118410113-36f5df00-b664-11eb-98d5-31e7809e102c.png">

LiveData : uma classe de suporte de dados que pode ser observada . Sempre mantém / armazena em cache a versão mais recente dos dados e notifica seus observadores quando os dados são alterados. LiveDataestá ciente do ciclo de vida. Os componentes da IU apenas observam os dados relevantes e não param ou retomam a observação. O LiveData gerencia tudo isso automaticamente, já que está ciente das alterações de status do ciclo de vida relevantes enquanto observa.

ViewModel : atua como um centro de comunicação entre o Repositório (dados) e a IU. A IU não precisa mais se preocupar com a origem dos dados. Instâncias de ViewModel sobrevivem à recriação de atividades / fragmentos.

Repositório: uma classe que você cria que é usada principalmente para gerenciar várias fontes de dados.

Entidade : classe anotada que descreve uma tabela de banco de dados ao trabalhar com Room .

Banco de dados do Room : simplifica o trabalho do banco de dados e serve como um ponto de acesso ao banco de dados SQLite subjacente (ocultaSQLiteOpenHelper). O banco de dados do Room usa o DAO para fazer consultas ao banco de dados SQLite.

Banco de dados SQLite: no armazenamento do dispositivo. A biblioteca de persistência do Room cria e mantém esse banco de dados para você.

DAO : objeto de acesso a dados. Um mapeamento de consultas SQL para funções. Ao usar um DAO, você chama os métodos e a Room cuida do resto.

<img width="200" alt="Screenshot_1622225461" src="https://user-images.githubusercontent.com/49947803/120025379-f765b600-bfc6-11eb-80f1-74a224aa2d3c.png">
