# Mini Folha de Pagamento

### P1 da disciplina Linguagem de Programação (Java)
Programa proposto pelo professor Emerson Alves: **Elaborar um código em Java para o cálculo de Folha de Pagamento.**

A tela de entrada deverá solicitar o nome do colaborador, salário bruto e o total de horas trabalhadas no mês.

<p align="center">
  <img src="https://github.com/user-attachments/assets/0e4026af-8865-4ae9-bcda-a7f1c1f56367" alt="Folha de Pagamento">
</p>

Considerar que o Salário Bruto é para um total de 160 horas trabalhadas no mês, caso o total de horas for diferente de 160 calcular a diferença no salário da seguinte forma:

**<p align="center">
  Valor do Salário por Hora = Salário bruto / 160 horas.**
</p>

Calcular a diferença entre as horas trabalhadas informadas e o valor de 160. A diferença multiplica pelo valor do salário por hora.

Se as horas trabalhadas forem maiores que 160, o colaborador recebe **Hora Extra**; se forem menores, ele terá **Desconto por Atraso**.  

## Para o cálculo do IRPF, utilizar a tabela abaixo.
<p align="center">
  <img src="https://github.com/user-attachments/assets/4df3086f-b2d3-4a75-9591-276fcb07a77f" alt ="Tabela IRPF">
</p>
<p align="center">
  <img src="https://github.com/user-attachments/assets/33d0ae10-f0e7-4d1e-8dcf-5287cf014190" alt ="Exemplode aplicação do IRPF">
</p>

## Para o cálculo do INSS utilizar a tabela de descontos progressiva abaixo:
<p align="center">
  <img src="https://github.com/user-attachments/assets/0794bc16-ea73-44f8-9dbd-f97976d9484e">
</p>


**Como funciona a tabela progressiva do INSS?**

Por exemplo, veja como fica o cálculo para um salário de R$ 3.000,00 no ano de 2024:

* 1ª faixa salarial: R$1.412,00 x 0,075 = 105,90

* 2ª faixa salarial: [2.666,68 – 1.412,00] x 0,09 = 1.254,68 x 0,09 = 112,92

* Faixa que atinge o salário: [3.000,00 – 2.666.68] x 0,12 = 333,32 x 0,12 = 40,00

**Total a recolher: 105,9 + 112,92 + 40,00 = R$ 258,82**

## Exemplo de saídas da Folha de Pagamento
<p align="center">
  Resultado com horas extras para pagar
</p>
<p align="center">
  <img src="https://github.com/user-attachments/assets/6b058358-c370-4cca-bac7-e0b291e79e3f">
</p>

<p align="center">
  Resultado com atraso para descontar
</p>
<p align="center">
  <img src="https://github.com/user-attachments/assets/4c9c527e-e6fd-4d50-83be-c8bd2094730d">
</p>

<p align="center">
  Resultado sem horas extras e sem descontos
</p>
<p align="center">
  <img src="https://github.com/user-attachments/assets/21329422-06b7-4128-933c-357e24a841ee">
</p>


<p align="center">
  Resultado para um salário bruto de 1.500,00
</p>
<p align="center">
  <img src="https://github.com/user-attachments/assets/af89fa0b-4aaf-4abe-91aa-36c4fae9fc36">
</p>

<p align="center">
  Resultado para um salário bruto de 3.000,00
</p>
<p align="center">
  <img src="https://github.com/user-attachments/assets/43fe18b7-7980-4935-b8d4-d693a3edec1c">
</p>

<p align="center">
  Resultado para um salário bruto de 5.000,00
</p>
<p align="center">
  <img src="https://github.com/user-attachments/assets/2a4e6edd-e655-4409-bb4a-1a947d32cd5e">
</p>

</p>
<p align="center">
  Figura 7- Resultado para um salário bruto de 9.000,00
</p>
<p align="center">
  <img src="https://github.com/user-attachments/assets/836a2eef-d0e6-484a-9a5d-3effa40c7139">
</p>


