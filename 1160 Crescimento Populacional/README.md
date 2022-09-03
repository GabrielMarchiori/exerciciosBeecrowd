# Crescimento Populacional

(exercício alterado por mim, para praticar, funções, getters and setters e loop)

 Mariazinha quer resolver um problema interessante. Dadas as informações de população e a taxa de crescimento de duas cidades quaisquer (A e B), ela gostaria de saber quantos anos levará para que a cidade A ultrapasse a cidade B em população. Sua tarefa é construir um programa que  apresente o tempo em anos para cada caso de teste.<br>

 Porém, em alguns casos o tempo pode ser muito grande, e Mariazinha não se interessa em saber exatamente o tempo para estes casos. Basta que você informe, nesta situação, a mensagem "Mais de 1 seculo.".<br>

### Entradas e saídas

 Começar escrevendo o nome, população e crescimento populacional de 2 cidades obrigatoriamente, depois o programa devera deixar aberta a opção de adicionar mais cidades ou não, quando for  escolhida a opção de não adicionar mais, começa a parte de comparação, aonde será escrito o nome de duas cidades.<br>

Caso essas duas cidades existam deve aparecer o tempo que será necessário para ambas terem a mesma população.<br>
Caso uma delas não existam deverá perguntar se deseja adicionar ou não. <br>
Caso deseje deverá voltar a tela de entrada inicial para preenchimento das informações.<br>
Caso não deseje adicionar deverá perguntar se deseja fazer mais comparações, voltando a tela de comparações.<br>

Ao final quando não houver mais comparações, imprimir uma lista com todas as cidades, populações e crescimento adicionados.<br>
Atenção: A população é sempre um valor inteiro, portanto, um crescimento de 2.5 % sobre uma população de 100 pessoas resultará em 102 pessoas, e não 102.5 pessoas, enquanto um crescimento de 2.5% sobre uma população de 1000 pessoas resultará em 1025 pessoas. Além disso, não utilize variáveis de precisão simples para as taxas de crescimento.<br>

### Exemplo

City 1#: <br>
>New York <br>
Population:  <br>
>100 <br>
Population growth: <br>
>1.0   <br>
City 2#: <br>
>Washington <br>
Population: <br>
>150 <br>
Population growth:
>0 <br>

Want to add one more city?<br>
>y <br>

City 3#: <br>
>Los Angeles <br>
Population:  <br>
>123 <br>
Population growth: <br>
>3.0   <br>

Want to add one more city?(y/n) <br>
>y <br>

City 4#: <br>
>Boston <br>
Population: <br>
>2000 <br>
Population growth:
>2.0 <br>

Want to add one more city?(y/n) <br>
>n <br>

Write the name of 2 cities for population comparison <br>

# exemplo saída

>New York <br>
>Washington <br>
51 years to have the same population <br>

want to make another comparison?
>y

>Boston <br>
>Los Angeles <br>
More than 1 century to have the same population.<br>

want to make another comparison?
>y

>California <br>
>Los Angeles <br>

California not added want to add this city? <br>
>y

City 5#: <br>
>California <br>
Population: <br>
>62422 <br>
Population growth:
>3.1 <br>

Want to add one more city?(y/n) <br>
>y <br>

City 6#: <br>
>Orlando <br>
Population: <br>
>484317 <br>
Population growth:
>1.0 <br>

Want to add one more city?(y/n) <br>
>n <br>

Write the name of 2 cities for population comparison <br>

>California <br>
>Orlando <br>
100 years to have the same population <br>

Want to make another comparison?
>n

Cities and information:
New York, population 100, population growth 1.0.
New York, population 100, population growth 1.0.
Washington, population 150, population growth 0.
Los Angeles, population 123, population growth 3.0.
Boston, population 2000, population growth 2.0.
California, population 62422, population growth 3.1.
Orlando, population 484317, population growth 1.0.

