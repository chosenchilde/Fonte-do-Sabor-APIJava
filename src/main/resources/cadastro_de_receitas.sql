INSERT INTO Usuario (uid, udate, uname, uemail, upassword, uphoto, ubio, ubirth, utype, ustatus) VALUES
(1, '2023-07-07', 'Eduardo Silva', 'usuario1@example.com', 'senha1', '/images/users/foto_1.jpg', 'Criador e fundador do site Fonte do Sabor, amante por receitas saborosas e o tempeiro caseiro.', '1994-01-01', 'Autor', 'on'),
(2, '2023-07-07', 'Mario Moreira', 'usuario2@example.com', 'senha2', '/images/users/foto_2.jpg', 'Desenvolvedor do site Fonte do Sabor e cozinheiro nas horas vagas.', '1976-01-02', 'Administrador', 'on'),
(3, '2023-07-07', 'Bruno Machado', 'usuario3@example.com', 'senha3', '/images/users/foto_3.jpg', 'Fundador do projeto "Um prato para todos" e dono do restaurante "Massas Machado". Escrevo receitas saborosas para o site.', '1984-01-03', 'Autor', 'on'),
(4, '2023-07-07', 'Amanda Borges', 'usuario4@example.com', 'senha4', '/images/users/foto_4.jpg', 'Autora do livro best-seller "Temperos de Oliva". Inovação e diversão na cozinha podem me descrever bem.', '1996-01-04', 'Autor', 'on');

INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Pudim de Leite', 'https://assets.unileversolutions.com/recipes-v2/236947.jpg', 'Primeiro, bata bem os ovos no liquidificador.<br> Acrescente o leite condensado e o leite, e bata novamente.</br> Derreta o açúcar na panela até ficar moreno, acrescente a água e deixe engrossar.<br>Coloque em uma forma redonda e despeje a massa do pudim por cima.</br> Asse em forno médio por 45 minutos, com a assadeira redonda dentro de uma maior com água. Espete um garfo para ver se está bem assado. Deixe esfriar e desenforme.', 'leite condensado, leite, ovos, açúcar, água', '0', 'on', '1', '2023-04-01 10:03:23');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Bolo de Morango', 'https://www.receitasnestle.com.br/sites/default/files/srh_recipes/9f412d6582c2ed971ecfe5295d353b68.jpg', 'Em uma batedeira, bata os ovos até dobrar de volume, acrescente o açúcar e bata bem.<br>Desligue a batedeira, misture aos poucos e delicadamente a farinha de trigo, o chocolate em pó e o fermento em pó peneirados.</br>Separe alguns morangos para a decoração, corte em fatias o restante e reserve.<br>Em uma panela, coloque o leite condensado, o leite, e o amido de milho e leve ao fogo médio mexendo sempre até engrossar.</br>Retire do fogo, acrescente metade do chocolate e misture delicadamente até o Chocolate derreter e incorporar ao creme.<br>Acrescente o creme de leite e misture até ficar homogêneo.</br>Com uma faca serrilhada, corte a massa do bolo em duas partes, recheie com metade do creme e com os morangos fatiados, e cubra com o restante do creme.<br>Decore com o restante do chocolate ralado em ralo grosso e com os morangos inteiros reservados.</br>', 'ovos, açúcar, farinha de trigo, chocolate em pó, fermento em pó, morangos, leite condensado, leite, amido de milho, chocolate meio amargo, creme de leite.', '0', 'on', '2', '2023-04-01 10:05:24');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Massa de Pizza', 'https://conteudo.imguol.com.br/c/entretenimento/ef/2022/03/09/massa-de-pizza-1646872864424_v2_4x3.jpg', 'Misture o fermento, o sal e o açúcar em um pouco de água morna, até que o fermento esteja completamente dissolvido.<br>Em seguida, adicione metade da medida de farinha de trigo, o óleo e mexa até criar uma consistência pastosa.</br>Acrescente o restante da farinha de trigo, a pinga, a água morna e misture bem. Assim que a massa desgrudar das mãos, deixe crescer por 30 minutos.</br>Abra os discos, fure a massa com um garfo e pincele o molho. Leve ao forno médio (180° C), preaquecido, por 15 minutos.</br>', 'farinha de trigo, fermento biológico, água, óleo, sal, açúcar, cachaça', '0', 'on', '1', '2023-04-01 10:10:23');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Bife de Panela', 'https://img.cybercook.com.br/imagens/receitas/313/bife-de-panela.jpg', 'Coloque os bifes em uma tigela, tempere com alho, sal e pimenta-do-reino. Em uma panela, aqueça o óleo e frite os bifes até dourar os dois lados.<br>Acrescente a cebola, o tomate e o pimentão, mexendo até o pimentão amaciar. Com as mãos, esfarele o caldo de carne, junte à panela, acrescente a água quente e cozinhe por 15 minutos ou até a carne amaciar, mexendo de vez em quando.</br>Disponha a carne em um refratário e espalhe os legumes por cima. Se desejar, sirva acompanhado de arroz branco.', 'Carne tipo coxão mole, alho, sal, pimenta-do-reino, óleo, cebola, tomate, pimentão, caldo de carne, água.', '0', 'on', '4', '2023-04-01 10:12:43');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Filé com Batatas', 'https://www.saboresajinomoto.com.br/uploads/images/recipes/file-com-batatas-coradas.jpg', 'Em uma tigela, tempere os filés com o azeite, a salsa picada, a cebola, o suco de limão, sal e pimenta-do-reino.<br>Em uma frigideira ou grelha, frite a carne até dourar os dois lados. Se desejar, sirva os filés acompanhados de batatas cozidas na manteiga e decorado com ervas frescas.</br>', 'Carne tipo filé mignon, azeite, cebola, limão, sal, pimenta-do-reino.', '0', 'on', '1', '2023-04-01 13:20:10');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Batata recheada à bolonhesa', 'https://claudia.abril.com.br/wp-content/uploads/2020/02/receita-batata-recheada-a-bolonhesa.jpg?quality=85', 'Aqueça o forno a 200°C. Lave bem e cozinhe as batatas com a casca. Não deixe amolecer demais. Reserve.<br>Em uma panela aqueça o azeite, doure a cebola e refogue a carne moída até ficar bem sequinha. Tempere com sal e pimenta-do-reino.</br>Acrescente o molho de tomate e deixe cozinhar por mais cinco minutos. Desligue o fogo e misture o creme de leite no molho. Faça um corte no meio de cada batata, deixando 2 cm em cada extremidade.<br>Recheie com o molho, cubra coma mussarela ralada, a batata-palha e salpique a salsa. Leveao forno para gratinar por aproximadamente dez minutos. Sirva em seguida.</br>', 'Batatas, azeite, cebola, carne moida, sal, pimenta-do-reino, molho de tomate, creme de leite sem soro, mussarela, batat palha, salsa.', '0', 'on', '2', '2023-04-01 13:44:20');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Lasanha caprese', 'https://claudia.abril.com.br/wp-content/uploads/2020/02/receita-lasanha-caprese.jpg?quality=85', 'Cozinha a lasanha al dente. Escorra e enxugue. Tempere o tomate com o sal, a pimenta, o azeite e o manjericão.<br>Em um refratário coloque uma camada com a metade da massa. distribua rodelas de tomate e a mussarela.</br>Por cima coloque o restante da massa e termine com uma camada de tomate e mussarela. regue com o azeite e salpique as folhas de manjericão.Leve ao forno prequecido a 220°C até a mussarela se derreter.', 'Massa de lasanha, tomate, sal, pimenta, azeite, majericão, mussarela.', '0', 'on', '3', '2023-03-01 14:30:30');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Pavê de chocolate branco', 'https://claudia.abril.com.br/wp-content/uploads/2020/02/receita-pave-de-chocolate-branco-2.jpg?quality=85', 'No liquidificador, bata a gelatina polvilhada no leite e dissolva em banho-maria com os demais ingredientes, menos o bombom, até homogeneizar.<br>Em taças, intercale pedaços de bombom picado e de creme, terminando em creme. Cubra com o chocolate. Leve à geladeira por 2 horas. Sirva.</br>', 'Gelatina sem sabor, leite, leite condensado, creme de leite, chocolate em pó, essencia de baunilha, bombom de chocolate branco, chocolate ao leite.', '0', 'on', '4', '2023-03-01 17:14:12');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Torta Romeu-e-Julieta', 'https://cdn0.tudoreceitas.com/pt/posts/2/6/1/torta_de_romeu_e_julieta_de_liquidificador_4162_orig.jpg', 'Misture os ingredientes da massa e forre o fundo de uma fôrma de aro removivel. Hidrate a gelatina na água e dissolva em banho-maria. Bata no liquidificador com os demais ingredientes do recheio e coloque sobre a massa<br>leve a geladeira por 4 horas. Então, desenforme a torta e espalhe a goiabada. Sirva em seguida.</br>', 'Biscoito de maisena, manteiga, gelatina sem sabor, água, requeijão, leite condensado, creme de leite, goiabada cremosa.', '0', 'on', '3', '2023-03-01 17:30:04');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Empada de presunto com requeijão', 'https://guiadacozinha.com.br/wp-content/uploads/2019/10/empada-de-presunto-com-requeijao-15939.jpg', 'Em uma tigela, misture todos os ingredientes da massa até ficar homogêneo. Com parte da massa, forre forminhas para empada untadas.<br>Em outra tigela, misture os ingredientes do recheio, recheie e tampe com a massa restante. Pincele com a gema e leve ao forno médio, preaquecido, por 20 minutos ou até dourar.</br>', 'Ricota, farinha, margarina, gema de ovo, presunto, requeijão, azeitonas verdes.', '0', 'on', '4',  '2023-03-01 20:21:10');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Empadinha Rápida', 'https://www.sabornamesa.com.br/media/k2/items/cache/facbb06d6d18afd30055031c05e0c8a3_XL.jpg', 'Em uma tigela, misture todos os ingredientes da massa, amassando até desgrudar das mãos. Com parte da massa, forre forminhas para a empada.<br>Misture os ingredientes do recheio e coloque dentro das empadas. Cubra com o restante da massa, pincele com a gema e leve ao forno médio, preaquecido, por 30 minutos ou até dourar. Retire e sirva em seguida.</br>', 'Farinha de trigo, creme de leite, sal, gordura vegetal, ovo, gema, ricota defumada, salsa.', '0', 'on', '1', '2023-05-01 00:30:30');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Torta de chocolate com limão', 'https://www.altoastral.com.br/antigas/uploads/legacy/2016/09/Torta-de-chocolate-com-limao.jpg', 'Misture o biscoito, a manteiga e forre o fundo de uma fôrma de aro removível. Dissolva a gelatina conforme as instruções da embalagem.<br>Misture com os demais ingredientes do recheio e espalhe sobre a massa. Gele por 3 horas. Misture os ingredientes da cobertura e espalhe sobre o recheio. Decore com raspas de limão.</br>', 'Biscoito de chocolate, manteiga, gelatina em pó sem sabor, chocolate meio amargo, creme de leite. rum, creme de leite, leite condensado. suco de limão, casca de limão.', '0', 'on', '2', '2023-05-01 01:40:30');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Esfiha aberta', 'https://i0.wp.com/portaledicase.com/wp-content/uploads/2022/09/shutterstock_2134687355-1.jpg?fit=1200%2C800&ssl=1', 'No liquidificador, bata os ingredientes da massa, menos a farinha, até ficar homogêneo. Despeje em uma tigela, acrescente a farinha e misture até desgrudar das mãos.<br>Deixe descansar por 15 minutos. À parte, misture todos os ingredientes do recheio até indorporar. Em uma superficie enfarinhada, abra a massa com um rolo e corte em circulos com a boca de um copo.</br>Espalhe o recheio e dobre as bordas. Disponha em uma fôrma untada com óleo e leve ao forno médio, preaquecido, por 30 minutos. Sirvo.', 'Óleo, água, ovo, sal, açúcar, fermento biológico fresco, farinha de trigo, farinha de trigo, carne tipo patinho, azeite, cebola, pimenta síria, tomate.', '0', 'on', '3', '2023-05-01 02:32:19');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Coxinha mista', 'https://www.sabornamesa.com.br/media/k2/items/cache/e3d995a152e18bb86fa197fdc98b26b8_XL.jpg', 'Em uma tigela, coloque as carnes, o parmesão, a farinha de trigo, a batat, a salsa, sal, pimenta, 2 ovos e misture bem até incorporar. Com pequenas porções da massa faça bolinhas e modele as coxinhas.<br>Passe no ovo restante ligeiramente batido e na farinha de rosca. Frite em óleo quente, aos poucos até dourar por igual. Retire do fogo, escorra em papel-toalha e sirva em seguida.</br>', 'carne tipo patinho, frango, queijo parmesão, farinha de trigo, batata, salsa, sal, pimenta-do-reino, ovos, farinha de rosca, óleo', '0', 'on', '3', '2023-05-01 07:20:42');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Abobrinha recheada com carne moída', 'https://static.itdg.com.br/images/1200-675/9cd511b4767b08749936617ae7793027/326224-original.jpg', 'Corte a ponta da abobrinha e retire a polpa com cuidado para não furar. Em uma panela, refogue a carne, o azeite, a cebola, o alho, a polpa da abobrinha picada, 1/2 lata do molho de tomate, o cominho, sal e pimenta por 10 minutos.<br>Recheie as abobrinhas com esse refogado e coloque em um refratario. Despeje o restante do molho, polvilhe com a mussarela e leve ao forno médio, pre-aquecido, por 35 minutos. Se desejar, sirva acompanhada de arroz branco e salada.</br>', 'Abobrinhas italianas, carne tipo patinho, azeite, cebola, alho, molho de tomate, cominho, sal, pimenta-do-reino, queijo mussarela.', '0', 'on', '1', '2023-05-01 08:02:17');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Farofa de carne moída com soja', 'https://cooknenjoy.com/wp-content/uploads/2022/09/farofa-de-soja-1-1200x901.jpg', 'Coloque os grãos de soja em uma panela de pressão, cubra com água e cozinhe por 30 minutos, após começar chiar. Retire do fogo, deixe sair a pressão, escorra a água e reserve.<br>Em outra panela, coloque o óleo, o alho, a cebola, a carne refogue até a carne moída amaciar. Junte a água e ferva por 2 minutos. Adicione a soja cozida, a farinha de mandioca, a azeitona, o cheiro-verde, sal, pimenta e misture até incorporar. Sirva em seguida.</br>', 'Grãos de soja, óleo, alho, cebola, carne tipo patinho moída, água, farinha de mandioca, azeitonas verdes, cheiro-verde, sal, pimenta-do-reino.', '0', 'on', '2', '2023-05-01 09:23:17');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Panqueca folhada 4 queijos', 'https://guiadacozinha.com.br/wp-content/uploads/2019/10/panqueca-folhada-4-queijos-16263.jpg', 'Corte as massas em quandrados iguais, misture os ingredientes do recheio e recheie as porções de massa. Enrole como rocambole e coloque em uma assadeira.<br> Leve ao forno médio, preaquecido, por 15 minutos ou até dourar levemente. Retire do forno, decore como desejar e sirva acompanhada de requeijão.</br>', 'Massa folhada, queijo mussarela, queijo provolone, ricota fresca.', '0', 'on', '1', '2023-05-01 11:12:00');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Panqueca de queijo e presunto', 'https://static.itdg.com.br/images/1200-675/843a111fbe724f469559a76906f61b99/355373-original.jpg', 'No liquidificador, bata a farinha, o leite, o óleo, o ovo, o sal e o fermento. Em uma frigideira antiaderente, frite porções da massa, formando panquecas.<br> Coloque 1 fatia de presunto e 1 de mussarela sobre cada massa e enrole como rocambole. Disponha em um refratário e cubra com o molho. Leve ao forno, preaquecido, por 20 minutos.</br>', 'Farinha de trigo, leite, óleo, ovo, sal, fermento em pó, molho de tomate, presunto, queijo mussarela.', '0', 'on', '3', '2023-05-01 09:23:27');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Bolinho de queijo', 'https://www.prazeresdamesa.com.br/wp-content/uploads/2018/05/empada.jpg', 'No liquidificador, bata todos os ingredientes e coloque em forminhas para empadar untadas com óleo. Leve ao forno, preaquecido pora 30 minutos ou até dourar levemente. Retire do forno, deixe amornar, desenforme e sirva.', 'Leite, queijo parmesão, polvilho doce, óleo, sal, ovos.', '0', 'on', '2', '2023-05-01 10:25:17');
INSERT INTO receita (rname, rimg, rcontent, ringredients, rview, rstatus, rauthor, rdate) VALUES 
( 'Panqueca de batata', 'https://anamariabrogui.com.br/assets/uploads/receitas/fotos/usuario-2847-54a67dc81516bcd811bffd01f355cf05.jpg', 'No liquidificador, bata todos os ingredientes por 5 minutos. Frite pequenas porções da massa em uma frigideira untada, dourando dos dois lados. Sirva com o recheio e o molho de sua preferência.', 'Ovos, cebola, sal, batata, tempero a gosto, farinha de trigo, margarina.', '0', 'on', '4', '2023-06-01 10:23:17');

