import javax.persistence.EntityManager;

import com.mk.bandas.dao.FaixaVariavelDao;
import com.mk.bandas.dao.JPAUtil;
import com.mk.bandas.dao.ZonaDao;
import com.mk.bandas.model.FaixaVariavel;
import com.mk.bandas.model.Zona;

public class CarregadorDadosBasicosUtil {
	
	public static void carregarFaixasDeVariaveis() {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		FaixaVariavelDao dao = new FaixaVariavelDao(em);
		//carregarCapital(dao);	
		carregarNiteroi(dao);
		
		em.getTransaction().commit();
		em.close();
	}

	private static void carregarNiteroi(FaixaVariavelDao dao) {
		dao.incluir(new FaixaVariavel("eleat", 0F, 82000F, 0.1F));
		dao.incluir(new FaixaVariavel("eleat", 82001F, 87000F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 87001F, 92000F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 92001F, 97000F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 97001F, 102000F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 102001F, 107000F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 107001F, 112000F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 112001F, 117000F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 117001f, 122000f, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 122001f, 127000F, 1F));
		dao.incluir(new FaixaVariavel("eleat", 127001F, 132000F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 132001F, 137000F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 137001F, 142000F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 142001F, 147000F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 147001F, 152000F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 152001F, 157000F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 157001F, 162000F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 162001F, 167000F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 167001F, 9999999F, 0.1F));	
		
		dao.incluir(new FaixaVariavel("creleit", 0F, 	 85000F, 0.1F));
		dao.incluir(new FaixaVariavel("creleit", 85001F, 90000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 90001F, 95000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 95001F, 100000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 100001F,105000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 105001F,110000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 110001F,115000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 115001F,120000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 120001F,125000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 125001F,130000F, 1F));
		dao.incluir(new FaixaVariavel("creleit", 130001F,135000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 135001F,140000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 140001F,145000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 145001F,150000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 150001F,155000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 155001F,160000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 160001F,165000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 165001F,170000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 170001F,999999F, 0.1F));
		
		dao.incluir(new FaixaVariavel("mov", 0F, 8120F, 	0.1F));
		dao.incluir(new FaixaVariavel("mov", 8121F, 8170F, 	0.2F));
		dao.incluir(new FaixaVariavel("mov", 8171F, 8220F, 	0.3F));
		dao.incluir(new FaixaVariavel("mov", 8221F, 8270F, 	0.4F));
		dao.incluir(new FaixaVariavel("mov", 8271F, 8320F, 	0.5F));
		dao.incluir(new FaixaVariavel("mov", 8321F, 8370F, 	0.6F));
		dao.incluir(new FaixaVariavel("mov", 8371F, 8420F, 	0.7F));
		dao.incluir(new FaixaVariavel("mov", 8421F, 8470F, 	0.8F));
		dao.incluir(new FaixaVariavel("mov", 8471F, 8520F, 	0.9F));
		dao.incluir(new FaixaVariavel("mov", 8521F, 8570F, 	1F));
		dao.incluir(new FaixaVariavel("mov", 8571F, 8620F, 	0.9F));
		dao.incluir(new FaixaVariavel("mov", 8621F, 8670F, 	0.8F));
		dao.incluir(new FaixaVariavel("mov", 8671F, 8720F, 	0.7F));
		dao.incluir(new FaixaVariavel("mov", 8721F, 8770F, 	0.6F));
		dao.incluir(new FaixaVariavel("mov", 8771F, 8820F, 	0.5F));
		dao.incluir(new FaixaVariavel("mov", 8821F, 8870F, 	0.4F));
		dao.incluir(new FaixaVariavel("mov", 8871F, 8920F, 	0.3F));
		dao.incluir(new FaixaVariavel("mov", 8921F, 8970F, 	0.2F));
		dao.incluir(new FaixaVariavel("mov", 8971F, 99999F, 0.1F));
		System.out.println("registros de faixas de NITEROI carregados");
	}

	private static void carregarCapital(FaixaVariavelDao dao) {
		dao.incluir(new FaixaVariavel("eleat", 0F, 49000F, 0.1F));
		dao.incluir(new FaixaVariavel("eleat", 49001F, 55000F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 55001F, 61000F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 61001F, 67000F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 67001F, 73000F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 73001F, 79000F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 79001F, 85000F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 85001F, 91000F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 91001f, 97000f, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 97001f, 103000F, 1F));
		dao.incluir(new FaixaVariavel("eleat", 103001F, 109000F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 109001F, 115000F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 115001F, 121000F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 121001F, 127000F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 127001F, 133000F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 133001F, 139000F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 139001F, 145000F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 145001F, 151000F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 151001F, 9999999F, 0.1F));	
		dao.incluir(new FaixaVariavel("creleit", 0F, 52000F, 0.1F));
		dao.incluir(new FaixaVariavel("creleit", 52001F, 58000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 58001F, 64000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 64001F, 70000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 70001F, 76000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 76001F, 82000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 82001F, 88000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 88001F, 94000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 94001f, 100000f, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 100001f, 106000F, 1F));
		dao.incluir(new FaixaVariavel("creleit", 106001F, 112000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 112001F, 118000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 118001F, 124000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 124001F, 130000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 130001F, 136000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 136001F, 142000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 142001F, 148000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 148001F, 154000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 154001F, 9999999F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 0F, 4000F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 4001F, 4500F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 4501F, 5000F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 5001F, 5500F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 5501F, 6000F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 6001F, 6500F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 6501F, 7000F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 7001F, 7500F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 7501F, 8000F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 8001F, 8500F, 1F));
		dao.incluir(new FaixaVariavel("mov", 8501F, 9000F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9001F, 9500F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 9501F, 10000F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 10001F, 10500F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 10501F, 11000F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 11001F, 11500F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 11501F, 12000F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 12001F, 12500F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 12501F, 9999999F, 0.1F));
	}
	
	public static void carregarDadosZonas() {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		ZonaDao dao = new ZonaDao(em);
		//CAPITAL
		dao.incluir(new Zona(1,"centro",-22.897049f,-43.189729f,28248,26814,2991));
		dao.incluir(new Zona(2,"centro",-22.897049f,-43.189729f,49566,50237,3752));
		dao.incluir(new Zona(3,"flamengo",-22.932629f,-43.179069f,42197,40617,3119));
		dao.incluir(new Zona(4,"jardim botânico",-22.972055f,-43.224402f,49076,48530,3298));
		dao.incluir(new Zona(5,"copacabana",-22.977707f,-43.192638f,35677,34213,3118));
		dao.incluir(new Zona(6,"zona norte",-22.914924f,-43.234485f,31629,30267,1739));
		dao.incluir(new Zona(7,"zona norte",-22.924963f,-43.235647f,72322,71244,4674));
		dao.incluir(new Zona(8,"méier I",-22.903927f,-43.267238f,51413,52484,4525));
		dao.incluir(new Zona(9,"barra da tijuca",-22.992461f,-43.366875f,112087,136101,12597));
		dao.incluir(new Zona(10,"méier II",-22.893664f,-43.311854f,53391,54166,4182));
		dao.incluir(new Zona(11,"leopoldina",-22.843044f,-43.265984f,43651,44498,2828));
		dao.incluir(new Zona(12,"madureira",-22.882287f,-43.324499f,22053,21338,1526));
		dao.incluir(new Zona(13,"barra da tijuca",-22.992461f,-43.366875f,59212,60567,4325));
		dao.incluir(new Zona(14,"méier I",-22.895185f,-43.28058f,35712,34626,2075));
		dao.incluir(new Zona(15,"marechal hermes",-22.861721f,-43.369687f,34559,33176,2181));
		dao.incluir(new Zona(16,"flamengo",-22.932543f,-43.179115f,50161,48749,3685));
		dao.incluir(new Zona(17,"jardim botânico",-22.972055f,-43.224402f,49264,47758,3429));
		dao.incluir(new Zona(18,"copacabana",-22.977707f,-43.192638f,29815,28474,2453));
		dao.incluir(new Zona(19,"zona norte",-22.914924f,-43.234485f,49505,48234,3297));
		dao.incluir(new Zona(20,"méier II",-22.90413f,-43.295711f,46913,47758,3518));
		dao.incluir(new Zona(21,"leopoldina",-22.843094f,-43.266052f,58558,64008,5108));
		dao.incluir(new Zona(22,"irajá",-22.846529f,-43.324597f,65576,64554,4118));
		dao.incluir(new Zona(23,"marechal hermes",-22.861721f,-43.369687f,53618,54195,4029));
		dao.incluir(new Zona(24,"bangu",-22.871347f,-43.461271f,64200,67237,5795));
		dao.incluir(new Zona(25,"santa cruz",-22.912515f,-43.686457f,76219,90675,9360));
		dao.incluir(new Zona(117,"ilha do governador",-22.804163f,-43.18141f,47246,46234,2977));
		dao.incluir(new Zona(118,"madureira",-22.882287f,-43.324499f,44197,46018,3858));
		dao.incluir(new Zona(119,"barra da tijuca",-22.992461f,-43.366875f,79231,85310,7923));
		dao.incluir(new Zona(120,"campo grande",-22.903508f,-43.572923f,75637,87292,5706));
		dao.incluir(new Zona(121,"leopoldina",-22.851425f,-43.263778f,30951,29643,1951));
		dao.incluir(new Zona(122,"campo grande",-22.904423f,-43.5736f,76713,84521,6431));
		dao.incluir(new Zona(123,"deodoro",-22.855849f,-43.38654f,52190,54833,3768));
		dao.incluir(new Zona(124,"bangu",-22.871347f,-43.461271f,32018,31259,1976));
		dao.incluir(new Zona(125,"santa cruz",-22.91836f,-43.68567f,55874,60964,5810));
		dao.incluir(new Zona(160,"leopoldina",-22.843044f,-43.265984f,43170,42509,3154));
		dao.incluir(new Zona(161,"leopoldina",-22.840931f,-43.266172f,84966,89507,7819));
		dao.incluir(new Zona(162,"leopoldina",-22.840931f,-43.266172f,43865,43127,3602));
		dao.incluir(new Zona(163,"flamengo",-22.932543f,-43.179115f,44873,45325,3470));
		dao.incluir(new Zona(164,"flamengo",-22.932543f,-43.179115f,32220,32998,2943));
		dao.incluir(new Zona(165,"jardim botânico",-22.972055f,-43.224402f,28427,26750,1940));
		dao.incluir(new Zona(166,"jardim botânico",-22.972055f,-43.224402f,35927,35493,2539));
		dao.incluir(new Zona(167,"pavuna",-22.836316f,-43.381542f,71353,73913,6538));
		dao.incluir(new Zona(168,"méier III",-22.881319f,-43.274324f,40196,39799,2782));
		dao.incluir(new Zona(169,"méier III",-22.873355f,-43.257996f,52521,52305,4197));
		dao.incluir(new Zona(170,"zona norte",-22.914924f,-43.234485f,53784,54038,3397));
		dao.incluir(new Zona(171,"zona norte",-22.924963f,-43.235647f,41970,41710,3188));
		dao.incluir(new Zona(173,"zona norte",-22.916278f,-43.252383f,37469,39443,2377));
		dao.incluir(new Zona(175,"pavuna",-22.836316f,-43.381542f,53680,54061,3982));
		dao.incluir(new Zona(176,"irajá",-22.846529f,-43.324597f,48321,49342,3384));
		dao.incluir(new Zona(177,"irajá",-22.846529f,-43.324597f,47549,46746,2889));
		dao.incluir(new Zona(178,"deodoro",-22.855849f,-43.38654f,38579,40248,3208));
		dao.incluir(new Zona(179,"barra da tijuca",-22.992461f,-43.366875f,121720,131946,16092));
		dao.incluir(new Zona(180,"jacarepaguá",-22.917413f,-43.367869f,87122,91445,8000));
		dao.incluir(new Zona(182,"jacarepaguá",-22.917413f,-43.367869f,86950,99246,8625));
		dao.incluir(new Zona(185,"madureira",-22.917413f,-43.367869f,61989,66659,5442));
		dao.incluir(new Zona(188,"leopoldina",-22.842269f,-43.271134f,47196,48421,3977));
		dao.incluir(new Zona(189,"irajá",-22.845448f,-43.301387f,47066,48501,3597));
		dao.incluir(new Zona(190,"irajá",-22.846529f,-43.324597f,44138,44507,2700));
		dao.incluir(new Zona(191,"ilha do governador",-22.806789f,-43.181266f,58771,62044,4678));
		dao.incluir(new Zona(192,"ilha do governador",-22.800952f,-43.200193f,65204,66961,4879));
		dao.incluir(new Zona(193,"centro",-22.897049f,-43.189729f,39596,38564,3304));
		dao.incluir(new Zona(204,"centro",-22.897049f,-43.189729f,36091,35110,3132));
		dao.incluir(new Zona(205,"copacabana",-22.977707f,-43.192638f,30750,31212,2665));
		dao.incluir(new Zona(206,"copacabana",-22.977707f,-43.192638f,34137,33854,2946));
		dao.incluir(new Zona(207,"méier I",-22.895185f,-43.28058f,29886,30266,2090));
		dao.incluir(new Zona(208,"méier I",-22.895185f,-43.28058f,28768,26995,1644));
		dao.incluir(new Zona(209,"madureira",-22.917413f,-43.367869f,36071,36132,2332));
		dao.incluir(new Zona(210,"madureira",-22.917413f,-43.367869f,44728,46702,3271));
		dao.incluir(new Zona(211,"jardim botânico",-22.972055f,-43.224402f,76421,81059,8092));
		dao.incluir(new Zona(212,"jardim botânico",-22.972055f,-43.224402f,25912,24994,1741));
		dao.incluir(new Zona(213,"méier II",-22.903943f,-43.296097f,44095,42785,3236));
		dao.incluir(new Zona(214,"méier II",-22.904331f,-43.294574f,49731,49987,3534));
		dao.incluir(new Zona(215,"méier III",-22.881319f,-43.274324f,40395,39783,2508));
		dao.incluir(new Zona(216,"méier III",-22.881319f,-43.274324f,43916,45699,3181));
		dao.incluir(new Zona(217,"marechal hermes",-22.859193f,-43.375939f,49973,49307,3491));
		dao.incluir(new Zona(218,"madureira",-22.880765f,-43.325896f,54959,55879,4309));
		dao.incluir(new Zona(219,"madureira",-22.880765f,-43.325896f,62736,62762,4719));
		dao.incluir(new Zona(220,"madureira",-22.880765f,-43.325896f,43023,45102,3829));
		dao.incluir(new Zona(228,"zona norte",-22.914924f,-43.234485f,25824,26055,1504));
		dao.incluir(new Zona(229,"zona norte",-22.915683f,-43.208674f,60690,61972,5808));
		dao.incluir(new Zona(230,"bangu",-22.871347f,-43.461271f,58408,64596,5468));
		dao.incluir(new Zona(231,"bangu",-22.871347f,-43.461271f,40626,42344,3386));
		dao.incluir(new Zona(232,"bangu",-22.871347f,-43.461271f,32944,32058,2426));
		dao.incluir(new Zona(233,"bangu",-22.871347f,-43.461271f,48274,49017,3660));
		dao.incluir(new Zona(234,"bangu",-22.871347f,-43.461271f,48360,49967,3653));
		dao.incluir(new Zona(235,"bangu",-22.871347f,-43.461271f,37846,37036,2308));
		dao.incluir(new Zona(236,"bangu",-22.871347f,-43.461271f,22533,22066,1404));
		dao.incluir(new Zona(237,"bangu",-22.871347f,-43.461271f,42195,42832,3109));
		dao.incluir(new Zona(238,"bangu",-22.878617f,-43.46352f,48097,51360,4487));
		dao.incluir(new Zona(240,"santa cruz",-22.91836f,-43.68567f,44370,43770,3726));
		dao.incluir(new Zona(241,"santa cruz",-22.91836f,-43.68567f,62517,70118,5961));
		dao.incluir(new Zona(242,"campo grande",-22.907056f,-43.569767f,68802,74743,6223));
		dao.incluir(new Zona(243,"santa cruz",-22.91836f,-43.68567f,64292,71047,6960));
		dao.incluir(new Zona(244,"campo grande",-22.903853f,-43.573282f,35944,37322,2471));
		dao.incluir(new Zona(245,"campo grande",-22.894698f,-43.559618f,68306,70010,5564));
		dao.incluir(new Zona(246,"santa cruz",-22.91836f,-43.68567f,96515,109056,9223));
		dao.incluir(new Zona(252,"copacabana",-22.977707f,-43.192638f,45372,46039,4591));
		
		//INTERIOR
		//NITEROI
		dao.incluir(new Zona(71	,"NITEROI", 0f, 0f, 45706, 45335, 2603));
		dao.incluir(new Zona(72	,"NITEROI", 0f, 0f, 50396, 50089, 3485));
		dao.incluir(new Zona(113,"NITEROI", 0f, 0f, 28035, 27885, 2330));
		dao.incluir(new Zona(114,"NITEROI", 0f, 0f, 25346, 25180, 1867));
		dao.incluir(new Zona(115,"NITEROI", 0f, 0f, 30680, 30491, 2152));
		dao.incluir(new Zona(140,"NITEROI", 0f, 0f, 23600, 23533, 1294));
		dao.incluir(new Zona(142,"NITEROI", 0f, 0f, 36270, 36046, 2359));
		dao.incluir(new Zona(143,"NITEROI", 0f, 0f, 31146, 31042, 2061));
		dao.incluir(new Zona(144,"NITEROI", 0f, 0f, 35331, 35150, 2445));
		dao.incluir(new Zona(199,"NITEROI", 0f, 0f, 66164, 75826, 5055));
		
		em.getTransaction().commit();
		em.close();
		System.out.println("registros de zonas inseridos");
	}

	public static void carregarDadosBasicos() {
		carregarDadosZonas();
		carregarFaixasDeVariaveis();		
	}

}
