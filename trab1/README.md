PROJETO

// Clientes são:
// - Padrão
// - Especiais (compra mensal acima de 100)
// ------ Beneficios desconto de 10% (*0.9) no valor da compra
// ------ Recebe mais 10% (*0.9) de desconto se utilizar o cartão da empresa
// ------ Possui 30% (*0.7) de desconto no valor do frete
// - Prime (mensalidade de 20)
// ------ Frete grátis
// ------ Cashback DE R$ 0.03 A CADA REAL gasto na loja (total * 0.03)
// ------ Comprando no cartão da loja cashback de R$ 0.05 (total * 0.05)

// Cartão da empresa:
// - Começa com 4296 13XX XXXX XXXX

// Compra:
// - Calcular ICMS
// - Calulcar imposto municipal
// - Fora do DF 12% de ICMS e 4% de imposto municipal
// - Dentro do DF 18% de ICMS e 0% de imposto municipal
// - FRETE
// ------                           Capital	    Interior
// ------ Distrito Federal	        R$ 5,00	
// ------ Regiao Centro-oeste	    R$ 10,00	R$ 13,00
// ------ Regiao Nordeste	        R$ 15,00	R$ 18,00
// ------ Regiao Norte	            R$ 20,00	R$ 25,00
// ------ Regiao Sudeste	        R$ 7,00	    R$ 10,00
// ------ Regiao Sul	            R$ 10,00	R$ 13,00

// Nota fiscal:
// - Mostrar o imposto ICMS e Municipal para cada item
// - Mostrar os descontos para tipo de cliente

// Produto
// - ID
// - Descricao
// - Tipo de unidade
// - Valor do produto

// Venda
// - Data
// - ClienteID
// - Produtos 
// - Método de pagamento 
// - Valor do frete
// - Descontos (opcional)
// - Impostos(ICMS e Municipal)
// Considerar o desconto de cashback

///

// Exigências:
// --- Cadastrar usuário 
// --- Cadastrar produto
// --- Realizar venda de itens para Usuários 
// --- Calcular compras do usuário no último mês para saber se é especial (Compras mensais de 100)
// --- Calcular o saldo de cashback do cliente PRIME