# Tratamento de Valores Binários

Esse diretório tem exemplos de programas em Java que mexem com valores binários

---

### $$\color{red}\boxed{\mathbb{\color{lime}DECIMAL \space PARA \space BINARIO}}$$

Definimos um valor como binário quando ele aparece nessa estrutura: $(10)_2$

Definimos um valor como Decimal quando ele aparece nessa estrutura: $(10)_{10}$

Como se converte de Decimal para binário em forma algorítmica:

1) Pegamos o valor decimal, como $(18)_{10}$.
2) Devemos fazer múltiplas divisões por 2 até a divisão inteira dê 0.
3) Dessas divisões, devemos pegar os restos das divisões inteiras.

|Divisão|Resultado da divisão|Resto|
|---|---|---|
$18 \div 2$|$\color{magenta}9$|$\color{green}0$
$9 \div 2$|$\color{magenta}4$|$\color{green}1$
$4 \div 2$|$\color{magenta}2$|$\color{green}0$
$2 \div 2$|$\color{magenta}1$|$\color{green}0$
$1 \div 2$|$\color{magenta}0$|$\color{green}1$

4) Agora que temos os restos, o valor binário é a ordem dos restos de baixo para cima

|Divisão|Resto|ordem do binário
|---|---|---|
$18 \div 2$|$\color{green}0$|5º
$9 \div 2$|$\color{green}1$|4º
$4 \div 2$|$\color{green}0$|3º
$2 \div 2$|$\color{green}0$|2º
$1 \div 2$|$\color{green}1$|1º

5) Com essa visão, o valor binário do valor decimal $(18)_{10}$ é:

$\color{green}10010$ sendo apresentado como $(10010)_2$

--- 

### $$\color{red}\boxed{\mathbb{\color{lime}BINARIO \space PARA \space DECIMAL}}$$

Como vimos na parte inicial, mostramos os valores de decimal como $(18)_{10}$ e binário como $(10010)_2$.

Vamos pegar o exemplo do binário gerado pelo tópico do decimal para binário e calcular para decimal de volta, seguindo o seguinte algoritmo:

1) Devemos pegar o binário que queremos converter.
2) As posições de cada binário são da direita para a esquerda, essas posições nos ajudam no cálculo como mostra no exemplo do binário $(10010)_2$:

|||||||
|---|---|---|---|---|---|
**Valor**|$\color{green}1$|$\color{green}0$|$\color{green}0$|$\color{green}1$|$\color{green}0$
**Posição**|$\color{red}4$|$\color{red}3$|$\color{red}2$|$\color{red}1$|$\color{red}0$

3) Para calcular, funcionam da seguinte forma, pegamos o valor da posição e multiplicamos pela exponencial por 2, como no exemplo:

Se posição é $\color{red}0$ então devemos pazer a exponenciação por $\color{lightblue}2$, onde é $\color{lightblue}2^{\color{red}0}$.

Então se o valor na posição $\color{red}0$ é $\color{green}1$, fazemos o seguinte cálculo

$\color{green}1 \color{white}\times \color{lightblue}2^{\color{red}0} = \color{green}1 \times \color{lightblue}1 = \color{orange}1$

4) Agora que foi entendido a lógica, somente calculamos os valores onde o valor da posição for $\color{green}1$.

|||||||
|---|---|---|---|---|---|
**Valor**|$\color{green}1$|$\color{green}0$|$\color{green}0$|$\color{green}1$|$\color{green}0$
**Posição**|$\color{red}4$|$\color{red}3$|$\color{red}2$|$\color{red}1$|$\color{red}0$
**Cálculo**|$\color{green}1 \color{white}\times \color{lightblue}2^{\color{red}4}$|||$\color{green}1 \color{white}\times \color{lightblue}2^{\color{red}1}$|

5) Pegamos as fórmulas descobertas da tabela e vamos somar os resultados:

$(\color{green}1 \color{white}\times \color{lightblue}2^{\color{red}4}\color{while}) + (\color{green}1 \color{white}\times \color{lightblue}2^{\color{red}1}\color{white}) = (\color{green}1 \color{white}\times \color{lightblue}2 \times 2 \times 2 \times 2 \color{white}) + (\color{green}1 \color{white}\times \color{lightblue} 2 \color{white})$

$(\color{green}1 \color{white}\times \color{lightblue}16 \color{white}) + (\color{lightblue}2 \color{white}) = 16 + 2 = \color{orange}18$
