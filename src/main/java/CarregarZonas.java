import javax.persistence.EntityManager;

import com.mk.bandas.dao.JPAUtil;
import com.mk.bandas.dao.ZonaDao;
import com.mk.bandas.model.FaixaVariavel;
import com.mk.bandas.model.Zona;

public class CarregarZonas {
	
	public static void main(String[] args) {
		EntityManager em = new JPAUtil().getEntityManager();
		em.getTransaction().begin();
		ZonaDao dao = new ZonaDao(em);
		
		dao.incluir(new Zona(	1	,"centro",			-22.897049f,	-43.189729f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	2	,"centro",			-22.897049f,	-43.189729f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	3	,"flamengo",		-22.932629f,	-43.179069f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	4	,"jardim botânico",	-22.972055f,	-43.224402f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	5	,"copacabana",		-22.977707f,	-43.192638f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	6	,"zona norte",		-22.914924f,	-43.234485f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	7	,"zona norte",		-22.924963f,	-43.235647f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	8	,"méier I",			-22.903927f,	-43.267238f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	9	,"barra da tijuca",	-22.992461f,	-43.366875f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	10	,"méier II",		-22.893664f,	-43.311854f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	11	,"leopoldina",		-22.843044f,	-43.265984f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	12	,"madureira",		-22.882287f,	-43.324499f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	13	,"barra da tijuca",	-22.992461f,	-43.366875f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	14	,"méier I",			-22.895185f,	-43.28058f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	15	,"marechal hermes",	-22.861721f,	-43.369687f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	16	,"flamengo",		-22.932543f,	-43.179115f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	17	,"jardim botânico",	-22.972055f,	-43.224402f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	18	,"copacabana",		-22.977707f,	-43.192638f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	19	,"zona norte",		-22.914924f,	-43.234485f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	20	,"méier II",		-22.90413f,		-43.295711f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	21	,"leopoldina",		-22.843094f,	-43.266052f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	22	,"irajá",			-22.846529f,	-43.324597f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	23	,"marechal hermes",	-22.861721f,	-43.369687f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	24	,"bangu",			-22.871347f,	-43.461271f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	25	,"santa cruz",		-22.912515f,	-43.686457f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	117	,"ilha do governador",	-22.804163f,-43.18141f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	118	,"madureira",		-22.882287f,	-43.324499f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	119	,"barra da tijuca",	-22.992461f,	-43.366875f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	120	,"campo grande",	-22.903508f,	-43.572923f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	121	,"leopoldina",		-22.851425f,	-43.263778f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	122	,"campo grande",	-22.904423f,	-43.5736f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	123	,"deodoro",			-22.855849f,	-43.38654f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	124	,"bangu",			-22.871347f,	-43.461271f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	125	,"santa cruz",		-22.91836f,		-43.68567f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	160	,"leopoldina",		-22.843044f,	-43.265984f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	161	,"leopoldina",		-22.840931f,	-43.266172f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	162	,"leopoldina",		-22.840931f,	-43.266172f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	163	,"flamengo",		-22.932543f,	-43.179115f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	164	,"flamengo",		-22.932543f,	-43.179115f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	165	,"jardim botânico",	-22.972055f,	-43.224402f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	166	,"jardim botânico",	-22.972055f,	-43.224402f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	167	,"pavuna",			-22.836316f,	-43.381542f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	168	,"méier III",		-22.881319f,	-43.274324f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	169	,"méier III",		-22.873355f,	-43.257996f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	170	,"zona norte",		-22.914924f,	-43.234485f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	171	,"zona norte",		-22.924963f,	-43.235647f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	173	,"zona norte",		-22.916278f,	-43.252383f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	175	,"pavuna",			-22.836316f,	-43.381542f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	176	,"irajá",			-22.846529f,	-43.324597f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	177	,"irajá",			-22.846529f,	-43.324597f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	178	,"deodoro",			-22.855849f,	-43.38654f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	179	,"barra da tijuca",	-22.992461f,	-43.366875f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	180	,"jacarepaguá",		-22.917413f,	-43.367869f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	182	,"jacarepaguá",		-22.917413f,	-43.367869f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	185	,"madureira",		-22.917413f,	-43.367869f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	188	,"leopoldina",		-22.842269f,	-43.271134f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	189	,"irajá",			-22.845448f,	-43.301387f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	190	,"irajá",			-22.846529f,	-43.324597f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	191	,"ilha do governador",	-22.806789f,-43.181266f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	192	,"ilha do governador",	-22.800952f,-43.200193f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	193	,"centro",			-22.897049f,	-43.189729f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	204	,"centro",			-22.897049f,	-43.189729f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	205	,"copacabana",		-22.977707f,	-43.192638f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	206	,"copacabana",		-22.977707f,	-43.192638f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	207	,"méier I",			-22.895185f,	-43.28058f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	208	,"méier I",			-22.895185f,	-43.28058f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	209	,"madureira",		-22.917413f,	-43.367869f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	210	,"madureira",		-22.917413f,	-43.367869f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	211	,"jardim botânico",	-22.972055f,	-43.224402f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	212	,"jardim botânico",	-22.972055f,	-43.224402f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	213	,"méier II",		-22.903943f,	-43.296097f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	214	,"méier II",		-22.904331f,	-43.294574f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	215	,"méier III",		-22.881319f,	-43.274324f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	216	,"méier III",		-22.881319f,	-43.274324f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	217	,"marechal hermes",	-22.859193f,	-43.375939f,	64000,	68000,	10000	));
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
		dao.incluir(new Zona(	241	,"santa cruz",		-22.91836f,		-43.68567f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	242	,"campo grande",	-22.907056f,	-43.569767f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	243	,"santa cruz",		-22.91836f,		-43.68567f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	244	,"campo grande",	-22.903853f,	-43.573282f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	245	,"campo grande",	-22.894698f,	-43.559618f,	64000,	68000,	10000	));
		dao.incluir(new Zona(	246	,"santa cruz",		-22.91836f,		-43.68567f,		64000,	68000,	10000	));
		dao.incluir(new Zona(	252	,"copacabana",		-22.977707f,	-43.192638f,	64000,	68000,	10000	));
		
		em.getTransaction().commit();
		em.close();
		System.out.println("registros de zonas inseridos");
		
	}
	
	

}
