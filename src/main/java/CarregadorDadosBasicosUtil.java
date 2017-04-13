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
		
		dao.incluir(new FaixaVariavel("eleat", 0F, 40000F, 0.01F));
		dao.incluir(new FaixaVariavel("eleat", 40001F, 50000F, 0.05F));
		dao.incluir(new FaixaVariavel("eleat", 50001F, 55000F, 0.1F));
		dao.incluir(new FaixaVariavel("eleat", 55001F, 60000F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 60001F, 65000F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 65001F, 70000F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 70001F, 75000F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 75001F, 80000F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 80001F, 85000F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 85001F, 90000F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 90001F, 96000F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 96001F, 100000F, 1F));
		dao.incluir(new FaixaVariavel("eleat", 100001F, 105000F, 1F));
		dao.incluir(new FaixaVariavel("eleat", 105001F, 110000F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 110001F, 115000F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 115001F, 120000F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 120001F, 125000F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 125001F, 130000F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 130001F, 135000F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 135001F, 140000F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 145001F, 150000F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 150001F, 9999999F, 0.1F));		
		dao.incluir(new FaixaVariavel("creleit", 0F, 40000F, 0.01F));
		dao.incluir(new FaixaVariavel("creleit", 40001F, 50000F, 0.05F));
		dao.incluir(new FaixaVariavel("creleit", 50001F, 55000F, 0.1F));
		dao.incluir(new FaixaVariavel("creleit", 55001F, 60000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 60001F, 65000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 65001F, 70000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 70001F, 75000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 75001F, 80000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 80001F, 85000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 85001F, 90000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 90001F, 96000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 96001F, 100000F, 1F));
		dao.incluir(new FaixaVariavel("creleit", 100001F, 104000F, 1F));
		dao.incluir(new FaixaVariavel("creleit", 104001F, 112000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 112001F, 120000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 120001F, 135000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 135001F, 150000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 150001F, 9999999F, 0.1F));	
		dao.incluir(new FaixaVariavel("mov", 0F, 1000F, 0.01F));
		dao.incluir(new FaixaVariavel("mov", 1001F, 2000F, 0.05F));
		dao.incluir(new FaixaVariavel("mov", 2001F, 3000F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 3001F, 4000F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 4001F, 5000F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 5001F, 6000F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 6001F, 7000F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 7001F, 8000F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 8001F, 9000F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 9001F, 10000F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 10001F, 11000F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 11001F, 12000F, 1F));
		dao.incluir(new FaixaVariavel("mov", 12001F, 13000F, 1F));
		dao.incluir(new FaixaVariavel("mov", 13001F, 14000F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 14001F, 15000F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 15001F, 16000F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 160001F, 17000F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 17001F, 18000F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 18001F, 19000F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 19001F, 20000F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 21001F, 22000F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 22001F, 9999999F, 0.1F));	
		
		em.getTransaction().commit();
		em.close();
		System.out.println("registros de faixas inseridos");
		
	}
	
	public static void carregarDadosZonas() {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		ZonaDao dao = new ZonaDao(em);
		
		dao.incluir(new Zona(	1	,"centro",			-22.897049f,	-43.189729f,	14000,	68000,	1000	));
		dao.incluir(new Zona(	2	,"centro",			-22.897049f,	-43.189729f,	24000,	68000,	1500	));
		dao.incluir(new Zona(	3	,"flamengo",		-22.932629f,	-43.179069f,	34000,	68000,	2000	));
		dao.incluir(new Zona(	4	,"jardim botânico",	-22.972055f,	-43.224402f,	44000,	68000,	3500	));
		dao.incluir(new Zona(	5	,"copacabana",		-22.977707f,	-43.192638f,	54000,	68000,	4000	));
		dao.incluir(new Zona(	6	,"zona norte",		-22.914924f,	-43.234485f,	64000,	68000,	4500	));
		dao.incluir(new Zona(	7	,"zona norte",		-22.924963f,	-43.235647f,	74000,	68000,	5200	));
		dao.incluir(new Zona(	8	,"méier I",			-22.903927f,	-43.267238f,	84000,	68000,	6000	));
		dao.incluir(new Zona(	9	,"barra da tijuca",	-22.992461f,	-43.366875f,	94000,	68000,	7500	));
		dao.incluir(new Zona(	10	,"méier II",		-22.893664f,	-43.311854f,	104000,	68000,	8500	));
		dao.incluir(new Zona(	11	,"leopoldina",		-22.843044f,	-43.265984f,	33000,	68000,	9000	));
		dao.incluir(new Zona(	12	,"madureira",		-22.882287f,	-43.324499f,	44000,	68000,	10000	));
		dao.incluir(new Zona(	13	,"barra da tijuca",	-22.992461f,	-43.366875f,	23000,	68000,	12000	));
		dao.incluir(new Zona(	14	,"méier I",			-22.895185f,	-43.28058f,		34000,	68000,	13000	));
		dao.incluir(new Zona(	15	,"marechal hermes",	-22.861721f,	-43.369687f,	44000,	68000,	14000	));
		dao.incluir(new Zona(	16	,"flamengo",		-22.932543f,	-43.179115f,	54000,	68000,	1000	));
		dao.incluir(new Zona(	17	,"jardim botânico",	-22.972055f,	-43.224402f,	64000,	68000,	2000	));
		dao.incluir(new Zona(	18	,"copacabana",		-22.977707f,	-43.192638f,	74000,	68000,	3000	));
		dao.incluir(new Zona(	19	,"zona norte",		-22.914924f,	-43.234485f,	84000,	68000,	40000	));
		dao.incluir(new Zona(	20	,"méier II",		-22.90413f,		-43.295711f,	94000,	68000,	50000	));
		dao.incluir(new Zona(	21	,"leopoldina",		-22.843094f,	-43.266052f,	114000,	68000,	60000	));
		dao.incluir(new Zona(	22	,"irajá",			-22.846529f,	-43.324597f,	124000,	68000,	70000	));
		dao.incluir(new Zona(	23	,"marechal hermes",	-22.861721f,	-43.369687f,	128000,	68000,	80000	));
		dao.incluir(new Zona(	24	,"bangu",			-22.871347f,	-43.461271f,	130000,	68000,	90000	));
		dao.incluir(new Zona(	25	,"santa cruz",		-22.912515f,	-43.686457f,	133000,	68000,	10000	));
		dao.incluir(new Zona(	117	,"ilha do governador",	-22.804163f,-43.18141f,		135000,	68000,	10000	));
		dao.incluir(new Zona(	118	,"madureira",		-22.882287f,	-43.324499f,	137000,	68000,	10000	));
		dao.incluir(new Zona(	119	,"barra da tijuca",	-22.992461f,	-43.366875f,	140000,	68000,	10000	));
		dao.incluir(new Zona(	120	,"campo grande",	-22.903508f,	-43.572923f,	24000,	68000,	10000	));
		dao.incluir(new Zona(	121	,"leopoldina",		-22.851425f,	-43.263778f,	34000,	68000,	10000	));
		dao.incluir(new Zona(	122	,"campo grande",	-22.904423f,	-43.5736f,		44000,	68000,	10000	));
		dao.incluir(new Zona(	123	,"deodoro",			-22.855849f,	-43.38654f,		54000,	68000,	10000	));
		dao.incluir(new Zona(	124	,"bangu",			-22.871347f,	-43.461271f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	125	,"santa cruz",		-22.91836f,		-43.68567f,		74000,	68000,	10000	));
		dao.incluir(new Zona(	160	,"leopoldina",		-22.843044f,	-43.265984f,	84000,	68000,	10000	));
		dao.incluir(new Zona(	161	,"leopoldina",		-22.840931f,	-43.266172f,	94000,	68000,	10000	));
		dao.incluir(new Zona(	162	,"leopoldina",		-22.840931f,	-43.266172f,	100000,	68000,	10000	));
		dao.incluir(new Zona(	163	,"flamengo",		-22.932543f,	-43.179115f,	101000,	68000,	10000	));
		dao.incluir(new Zona(	164	,"flamengo",		-22.932543f,	-43.179115f,	105000,	68000,	10000	));
		dao.incluir(new Zona(	165	,"jardim botânico",	-22.972055f,	-43.224402f,	108000,	68000,	10000	));
		dao.incluir(new Zona(	166	,"jardim botânico",	-22.972055f,	-43.224402f,	110000,	68000,	10000	));
		dao.incluir(new Zona(	167	,"pavuna",			-22.836316f,	-43.381542f,	111000,	68000,	10000	));
		dao.incluir(new Zona(	168	,"méier III",		-22.881319f,	-43.274324f,	121000,	68000,	10000	));
		dao.incluir(new Zona(	169	,"méier III",		-22.873355f,	-43.257996f,	122000,	68000,	10000	));
		dao.incluir(new Zona(	170	,"zona norte",		-22.914924f,	-43.234485f,	123000,	68000,	10000	));
		dao.incluir(new Zona(	171	,"zona norte",		-22.924963f,	-43.235647f,	125000,	68000,	10000	));
		dao.incluir(new Zona(	173	,"zona norte",		-22.916278f,	-43.252383f,	130000,	68000,	10000	));
		dao.incluir(new Zona(	175	,"pavuna",			-22.836316f,	-43.381542f,	135000,	68000,	10000	));
		dao.incluir(new Zona(	176	,"irajá",			-22.846529f,	-43.324597f,	140000,	68000,	10000	));
		dao.incluir(new Zona(	177	,"irajá",			-22.846529f,	-43.324597f,	104000,	68000,	10000	));
		dao.incluir(new Zona(	178	,"deodoro",			-22.855849f,	-43.38654f,		94000,	68000,	10000	));
		dao.incluir(new Zona(	179	,"barra da tijuca",	-22.992461f,	-43.366875f,	84000,	68000,	10000	));
		dao.incluir(new Zona(	180	,"jacarepaguá",		-22.917413f,	-43.367869f,	74000,	68000,	10000	));
		dao.incluir(new Zona(	182	,"jacarepaguá",		-22.917413f,	-43.367869f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	185	,"madureira",		-22.917413f,	-43.367869f,	54000,	68000,	10000	));
		dao.incluir(new Zona(	188	,"leopoldina",		-22.842269f,	-43.271134f,	58000,	68000,	10000	));
		dao.incluir(new Zona(	189	,"irajá",			-22.845448f,	-43.301387f,	33000,	68000,	10000	));
		dao.incluir(new Zona(	190	,"irajá",			-22.846529f,	-43.324597f,	32000,	68000,	10000	));
		dao.incluir(new Zona(	191	,"ilha do governador",	-22.806789f,-43.181266f,	32500,	68000,	10000	));
		dao.incluir(new Zona(	192	,"ilha do governador",	-22.800952f,-43.200193f,	66000,	68000,	10000	));
		dao.incluir(new Zona(	193	,"centro",			-22.897049f,	-43.189729f,	69000,	68000,	10000	));
		dao.incluir(new Zona(	204	,"centro",			-22.897049f,	-43.189729f,	71000,	68000,	10000	));
		dao.incluir(new Zona(	205	,"copacabana",		-22.977707f,	-43.192638f,	34000,	68000,	10000	));
		dao.incluir(new Zona(	206	,"copacabana",		-22.977707f,	-43.192638f,	38000,	68000,	10000	));
		dao.incluir(new Zona(	207	,"méier I",			-22.895185f,	-43.28058f,		29000,	68000,	10000	));
		dao.incluir(new Zona(	208	,"méier I",			-22.895185f,	-43.28058f,		48000,	68000,	10000	));
		dao.incluir(new Zona(	209	,"madureira",		-22.917413f,	-43.367869f,	55000,	68000,	10000	));
		dao.incluir(new Zona(	210	,"madureira",		-22.917413f,	-43.367869f,	74000,	68000,	10000	));
		dao.incluir(new Zona(	211	,"jardim botânico",	-22.972055f,	-43.224402f,	84000,	68000,	10000	));
		dao.incluir(new Zona(	212	,"jardim botânico",	-22.972055f,	-43.224402f,	94000,	68000,	10000	));
		dao.incluir(new Zona(	213	,"méier II",		-22.903943f,	-43.296097f,	101000,	68000,	10000	));
		dao.incluir(new Zona(	214	,"méier II",		-22.904331f,	-43.294574f,	102000,	68000,	10000	));
		dao.incluir(new Zona(	215	,"méier III",		-22.881319f,	-43.274324f,	107000,	68000,	10000	));
		dao.incluir(new Zona(	216	,"méier III",		-22.881319f,	-43.274324f,	106000,	68000,	10000	));
		dao.incluir(new Zona(	217	,"marechal hermes",	-22.859193f,	-43.375939f,	54000,	68000,	10000	));
		dao.incluir(new Zona(	218	,"madureira",		-22.880765f,	-43.325896f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	219	,"madureira",		-22.880765f,	-43.325896f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	220	,"madureira",		-22.880765f,	-43.325896f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	228	,"zona norte",		-22.914924f,	-43.234485f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	229	,"zona norte",		-22.915683f,	-43.208674f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	230	,"bangu",			-22.871347f,	-43.461271f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	231	,"bangu",			-22.871347f,	-43.461271f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	232	,"bangu",			-22.871347f,	-43.461271f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	233	,"bangu",			-22.871347f,	-43.461271f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	234	,"bangu",			-22.871347f,	-43.461271f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	235	,"bangu",			-22.871347f,	-43.461271f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	236	,"bangu",			-22.871347f,	-43.461271f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	237	,"bangu",			-22.871347f,	-43.461271f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	238	,"bangu",			-22.878617f,	-43.46352f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	240	,"santa cruz",		-22.91836f,		-43.68567f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	241	,"santa cruz",		-22.91836f,		-43.68567f,		30000,	68000,	10000	));
		dao.incluir(new Zona(	242	,"campo grande",	-22.907056f,	-43.569767f,	30001,	68000,	10000	));
		dao.incluir(new Zona(	243	,"santa cruz",		-22.91836f,		-43.68567f,		30001,	68000,	10000	));
		dao.incluir(new Zona(	244	,"campo grande",	-22.903853f,	-43.573282f,	90001,	68000,	10000	));
		dao.incluir(new Zona(	245	,"campo grande",	-22.894698f,	-43.559618f,	100000,	68000,	10000	));
		dao.incluir(new Zona(	246	,"santa cruz",		-22.91836f,		-43.68567f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	252	,"copacabana",		-22.977707f,	-43.192638f,	64000,	68000,	10000	));
		
		em.getTransaction().commit();
		em.close();
		System.out.println("registros de zonas inseridos");
		
	}

	public static void carregarDadosBasicos() {
		carregarDadosZonas();
		carregarFaixasDeVariaveis();		
	}

}
