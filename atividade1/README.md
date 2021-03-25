# QRCode de Texto

Fomos chamados por uma grande companhia para desenvolver um protótipo de pagamento utilizando apenas QRCodes, tanto para realizar e receber pagamentos. Grandes companhias também já desenvolveram produtos similares, como o Mercado Pago. Em outros países, esse sistema é utilizado amplamente por diversas pessoas da população. Essa demanda veio como uma forma de reduzir o contato das pessoas com cédulas de dinheiro, reduzindo a propagação de doenças e a necessidade das pessoas e carregar dinheiro físico.

O pagamento por QRCode apresenta elevados mecanismos de
segurança quando comparado com outros [tipos de pagamento](https://digitalcommons.wou.edu/cgi/viewcontent.cgi?referer=https://scholar.google.com.br/&httpsredir=1&article=1002&context=computerscience_studentpubs). Os usuários esse sistema apresentam [auto nível de satisfação](https://www.mdpi.com/071-1050/9/7/1186/htm).

Essa forma de transação vai permitir que cada usuário possa receber créditos e realizar pagamentos por QRCodes únicos gerados para a transação específica. A validação de que a chave criada é única ainda não será implementada. Ficamos incumbidos de desenvolver a primeira versão do sistema em que cada usuário pode possuir conta. Cada conta pode realizar pagamentos e receber créditos de outros usuários. Como ainda estamos nas etapas iniciais do projeto, todas as informações que serão embarcadas nos QRCode serão apresentadas como Strings. Quando um usuário for realizar um pagamento, ele deve informar o usuário que vai receber esse valor, o valor e a String do QRCode. Quando ele for receber algum valor, ele deve gerar a chave de autorização da transação.

## Como rodar a aplicação?

Na pasta *src* :

    javac -d bin App.java
    java -cp bin\ App
