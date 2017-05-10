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
		//carregarBelfordRoxo(dao);
		//carregarCamposDosGoytacazes(dao);
		//carregarDuqueDeCaxias(dao);
		//carregarPetropolis(dao);
		//carregarSaoGoncalo(dao);
		//carregarNovaIguacu(dao);
		//carregarSaoJoaoDeMeriti(dao);
		//carregarVoltaRedonda(dao);
		
		em.getTransaction().commit();
		em.close();
	}

	private static void carregarVoltaRedonda(FaixaVariavelDao dao) {
		dao.incluir(new FaixaVariavel("eleat", 0F, 69000F, 0.1F));
		dao.incluir(new FaixaVariavel("eleat", 69001F, 74000F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 74001F, 79000F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 79001F, 84000F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 84001F, 89000F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 89001F, 94000F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 94001F, 99000F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 99001F, 104000F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 104001F, 109000F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 109001F, 114000F, 1F));
		dao.incluir(new FaixaVariavel("eleat", 114001F, 119000F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 119001F, 124000F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 124001F, 129000F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 129001F, 134000F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 134001F, 139000F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 139001F, 144000F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 144001F, 149000F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 149001F, 154000F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 154001F, 999999F, 0.1F));

		dao.incluir(new FaixaVariavel("creleit", 0F, 71000F, 0.1F));
		dao.incluir(new FaixaVariavel("creleit", 71001F, 76000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 76001F, 81000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 81001F, 86000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 86001F, 91000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 91001F, 96000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 96001F, 101000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 101001F, 106000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 106001F, 111000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 111001F, 116000F, 1F));
		dao.incluir(new FaixaVariavel("creleit", 116001F, 121000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 121001F, 126000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 126001F, 131000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 131001F, 136000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 136001F, 141000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 141001F, 146000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 146001F, 151000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 151001F, 156000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 156001F, 999999F, 0.1F));
		
		/*ANTIGA
		dao.incluir(new FaixaVariavel("mov", 0F, 9800F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 9801F, 9850F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 9851F, 9900F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 9901F, 9950F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 9951F, 10000F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 10001F, 10050F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 10051F, 10100F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 10101F, 10150F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 10151F, 10200F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10201F, 10250F, 1F));
		dao.incluir(new FaixaVariavel("mov", 10251F, 10300F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10301F, 10350F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 10351F, 10400F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 10401F, 10450F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 10451F, 10500F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 10501F, 10550F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 10551F, 10600F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 10601F, 10650F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 10651F, 99999F, 0.1F));
		*/
		dao.incluir(new FaixaVariavel("mov", 0F, 5980F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 5981F, 6480F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 6481F, 6980F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 6981F, 7480F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 7481F, 7980F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 7981F, 8480F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 8481F, 8980F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 8981F, 9480F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 9481F, 9980F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9981F, 10480F, 1F));
		dao.incluir(new FaixaVariavel("mov", 10481F, 10980F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10981F, 11480F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 11481F, 11980F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 11981F, 12480F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 12481F, 12980F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 12981F, 13480F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 13481F, 13980F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 13981F, 14480F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 14481F, 99999F, 0.1F));
		
		System.out.println("registros de faixas de VOLTA REDONDA carregados");
		
	}

	private static void carregarSaoJoaoDeMeriti(FaixaVariavelDao dao) {
		dao.incluir(new FaixaVariavel("eleat", 0F, 80500F, 0.1F));
		dao.incluir(new FaixaVariavel("eleat", 80501F, 85500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 85501F, 90500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 90501F, 95500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 95501F, 100500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 100501F, 105500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 105501F, 110500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 110501F, 115500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 115501F, 120500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 120501F, 125500F, 1F));
		dao.incluir(new FaixaVariavel("eleat", 125501F, 130500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 130501F, 135500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 135501F, 140500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 140501F, 145500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 145501F, 150500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 150501F, 155500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 155501F, 160500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 160501F, 165500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 165501F, 999999F, 0.1F));
		
		dao.incluir(new FaixaVariavel("creleit", 0F, 86000F, 0.1F));
		dao.incluir(new FaixaVariavel("creleit", 86001F, 91000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 91001F, 96000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 96001F, 101000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 101001F, 106000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 106001F, 111000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 111001F, 116000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 116001F, 121000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 121001F, 126000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 126001F, 131000F, 1F));
		dao.incluir(new FaixaVariavel("creleit", 131001F, 136000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 136001F, 141000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 141001F, 146000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 146001F, 151000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 151001F, 156000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 156001F, 161000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 161001F, 166000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 166001F, 171000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 171001F, 999999F, 0.1F));

		/*ANTIGA
		dao.incluir(new FaixaVariavel("mov", 0F, 9050F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 9051F, 9100F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 9101F, 9150F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 9151F, 9200F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 9201F, 9250F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 9251F, 9300F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 9301F, 9350F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 9351F, 9400F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 9401F, 9450F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9451F, 9500F, 1F));
		dao.incluir(new FaixaVariavel("mov", 9501F, 9520F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9551F, 9540F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 9601F, 9560F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 9651F, 9580F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 9701F, 9600F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 9751F, 9620F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 9801F, 9640F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 9851F, 9660F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 9661F, 99999F, 0.1F));
		*/
		dao.incluir(new FaixaVariavel("mov", 0F, 5250F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 5251F, 5750F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 5751F, 6250F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 6251F, 6750F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 6751F, 7250F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 7251F, 7750F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 7751F, 8250F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 8251F, 8750F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 8751F, 9250F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9251F, 9750F, 1F));
		dao.incluir(new FaixaVariavel("mov", 9751F, 10250F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10251F, 10750F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 10751F, 11250F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 11251F, 11750F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 11751F, 12250F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 12251F, 12750F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 12751F, 13250F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 13251F, 13750F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 13751F, 99999F, 0.1F));

		System.out.println("registros de faixas de SAO JOAO DE MERITI carregados");
	}

	private static void carregarNovaIguacu(FaixaVariavelDao dao) {
		dao.incluir(new FaixaVariavel("eleat", 0F,		72500F, 0.1F));
		dao.incluir(new FaixaVariavel("eleat", 72501F,  77500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 77501F,  82500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 82501F,  87500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 87501F,  92500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 92501F,  97500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 97501F,  102500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 102501F, 107500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 107501F, 112500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 112501F, 117500F, 1F));
		dao.incluir(new FaixaVariavel("eleat", 117501F, 122500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 122501F, 127500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 127501F, 132500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 132501F, 137500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 137501F, 142500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 142501F, 147500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 147501F, 152500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 152501F, 157500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 157501F, 999999F, 0.1F));
		
		dao.incluir(new FaixaVariavel("creleit", 0F, 81000F, 0.1F));
		dao.incluir(new FaixaVariavel("creleit", 81001F, 86000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 86001F, 91000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 91001F, 96000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 96001F, 101000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 101001F, 106000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 106001F, 111000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 111001F, 116000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 116001F, 121000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 121001F, 126000F, 1F));
		dao.incluir(new FaixaVariavel("creleit", 126001F, 131000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 131001F, 136000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 136001F, 141000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 141001F, 146000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 146001F, 151000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 151001F, 156000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 156001F, 161000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 161001F, 166000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 166001F, 999999F, 0.1F));
		
		/*ANTIGA
		dao.incluir(new FaixaVariavel("mov", 0F, 9700F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 9701F, 9750F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 9751F, 9800F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 9801F, 9850F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 9851F, 9900F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 9901F, 9950F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 9951F, 10000F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 10001F, 10050F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 10051F, 10100F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10101F, 10150F, 1F));
		dao.incluir(new FaixaVariavel("mov", 10151F, 10200F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10201F, 10250F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 10251F, 10300F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 10301F, 10350F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 10351F, 10400F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 10401F, 10450F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 10451F, 10500F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 10501F, 10550F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 10551F, 999999F, 0.1F));
		*/
		
		dao.incluir(new FaixaVariavel("mov", 0F, 5880F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 5881F, 6380F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 6381F, 6880F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 6881F, 7380F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 7381F, 7880F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 7881F, 8380F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 8381F, 8880F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 8881F, 9380F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 9381F, 9880F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9881F, 10380F, 1F));
		dao.incluir(new FaixaVariavel("mov", 10381F, 10880F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10881F, 11380F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 11381F, 11880F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 11881F, 12380F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 12381F, 12880F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 12881F, 13380F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 13381F, 13880F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 13881F, 14380F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 14381F, 99999F, 0.1F));

		System.out.println("registros de faixas de NOVA IGUACU carregados");
		
	}

	private static void carregarSaoGoncalo(FaixaVariavelDao dao) {
		dao.incluir(new FaixaVariavel("eleat", 0F, 72500F, 0.1F));
		dao.incluir(new FaixaVariavel("eleat", 72501F, 77500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 77501F, 82500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 82501F, 87500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 87501F, 92500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 92501F, 97500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 97501F, 102500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 102501F, 107500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 107501F, 112500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 112501F, 117500F, 1F));
		dao.incluir(new FaixaVariavel("eleat", 117501F, 122500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 122501F, 127500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 127501F, 132500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 132501F, 137500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 137501F, 142500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 142501F, 147500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 147501F, 152500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 152501F, 157500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 157501F, 999999F, 0.1F));
		
		dao.incluir(new FaixaVariavel("creleit", 0F, 78000F, 0.1F));
		dao.incluir(new FaixaVariavel("creleit", 78001F, 83000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 83001F, 88000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 88001F, 93000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 93001F, 98000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 98001F, 103000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 103001F, 108000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 108001F, 113000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 113001F, 118000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 118001F, 123000F, 1F));
		dao.incluir(new FaixaVariavel("creleit", 123001F, 128000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 128001F, 133000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 133001F, 138000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 138001F, 143000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 143001F, 148000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 148001F, 153000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 153001F, 158000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 158001F, 163000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 163001F, 999999F, 0.1F));
		
		/*ANTIGA
		//mexi nessas faixas, pois as iniciais tinham furos
		dao.incluir(new FaixaVariavel("mov", 0F, 9150F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 9151F, 9200F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 9201F, 9250F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 9251F, 9300F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 9301F, 9350F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 9351F, 9400F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 9401F, 9450F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 9451F, 9500F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 9501F, 9550F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9551F, 9600F, 1F));
		dao.incluir(new FaixaVariavel("mov", 9601F, 9650F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9651F, 9700F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 9701F, 9750F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 9751F, 9800F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 9801F, 9850F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 9851F, 9900F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 9901F, 9950F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 9951F, 10000F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 10001F, 99999F, 0.1F));
		*/
		dao.incluir(new FaixaVariavel("mov", 0F, 5330F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 5331F, 5830F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 5831F, 6330F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 6331F, 6830F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 6831F, 7330F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 7331F, 7830F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 7831F, 8330F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 8331F, 8830F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 8831F, 9330F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9331F, 9830F, 1F));
		dao.incluir(new FaixaVariavel("mov", 9831F, 10330F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10331F, 10830F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 10831F, 11330F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 11331F, 11830F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 11831F, 12330F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 12331F, 12830F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 12831F, 13330F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 13331F, 13830F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 13831F, 99999F, 0.1F));
		
		System.out.println("registros de faixas de SAO GONCALO carregados");
	}

	private static void carregarPetropolis(FaixaVariavelDao dao) {
		dao.incluir(new FaixaVariavel("eleat", 0F, 77500F, 0.1F));
		dao.incluir(new FaixaVariavel("eleat", 77501F, 82500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 82501F, 87500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 87501F, 92500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 92501F, 97500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 97501F, 102500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 102501F, 107500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 107501F, 112500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 112501F, 117500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 117501F, 122500F, 1F));
		dao.incluir(new FaixaVariavel("eleat", 122501F, 127500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 127501F, 132500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 132501F, 137500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 137501F, 142500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 142501F, 147500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 147501F, 152500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 152501F, 157500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 157501F, 162500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 162500F, 999999F, 0.1F));
		
		dao.incluir(new FaixaVariavel("creleit", 0F, 85000F, 0.1F));
		dao.incluir(new FaixaVariavel("creleit", 85001F, 90000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 90001F, 95000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 95001F, 100000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 100001F, 105000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 105001F, 110000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 110001F, 115000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 115001F, 120000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 120001F, 125000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 125001F, 130000F, 1F));
		dao.incluir(new FaixaVariavel("creleit", 130001F, 135000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 135001F, 140000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 140001F, 145000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 145001F, 150000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 150001F, 155000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 155001F, 160000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 160001F, 165000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 165001F, 170000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 170001F, 9999999F, 0.1F));

		/*ANTIGA
		dao.incluir(new FaixaVariavel("mov", 0F, 10200F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 11001F, 10250F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 10951F, 10300F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 10901F, 10350F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 10851F, 10400F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 10801F, 10450F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 10751F, 10500F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 10701F, 10550F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 10651F, 10600F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10601F, 10650F, 1F));
		dao.incluir(new FaixaVariavel("mov", 10551F, 10700F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10501F, 10750F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 10451F, 10800F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 10401F, 10850F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 10351F, 10900F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 10301F, 10950F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 10251F, 11000F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 10201F, 11050F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 11051F, 99999F, 0.1F));
		*/
		dao.incluir(new FaixaVariavel("mov", 0F, 6390F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 6391F, 6890F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 6891F, 7390F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 7391F, 7890F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 7891F, 8390F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 8391F, 8890F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 8891F, 9390F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 9391F, 9890F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 9891F, 10390F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10391F, 10890F, 1F));
		dao.incluir(new FaixaVariavel("mov", 10891F, 11390F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 11391F, 11890F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 11891F, 12390F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 12391F, 12890F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 12891F, 13390F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 13391F, 13890F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 13891F, 14390F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 14391F, 14890F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 14891F, 99999F, 0.1F));
		System.out.println("registros de faixas de PETROPOLIS carregados");
	}

	private static void carregarDuqueDeCaxias(FaixaVariavelDao dao) {
		dao.incluir(new FaixaVariavel("eleat", 0F, 62500F, 0.1F));
		dao.incluir(new FaixaVariavel("eleat", 62501F, 67500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 67501F, 72500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 72501F, 77500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 77501F, 82500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 82501F, 87500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 87501F, 92500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 92501F, 97500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 97501F, 102500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 102501F, 107500F, 1F));
		dao.incluir(new FaixaVariavel("eleat", 107501F, 112500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 112501F, 117500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 117501F, 122500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 122501F, 127500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 127501F, 132500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 132501F, 137500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 137501F, 142500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 142501F, 147500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 147501F, 999999F, 0.1F));
		
		dao.incluir(new FaixaVariavel("creleit", 0F, 69000F, 0.1F));
		dao.incluir(new FaixaVariavel("creleit", 69001F, 74000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 74001F, 79000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 79001F, 84000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 84001F, 89000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 89001F, 94000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 94001F, 99000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 99001F, 104000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 104001F, 109000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 109001F, 114000F, 1F));
		dao.incluir(new FaixaVariavel("creleit", 114001F, 119000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 119001F, 124000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 124001F, 129000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 129001F, 134000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 134001F, 139000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 139001F, 144000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 144001F, 149000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 149001F, 154000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 154001F, 999999F, 0.1F));
		
		/* antiga
		dao.incluir(new FaixaVariavel("mov", 0F, 	8800F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 8801F, 8850F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 8851F, 8900F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 8901F, 8950F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 8951F, 9000F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 9001F, 9050F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 9051F, 9100F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 9101F, 9150F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 9151F, 9200F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9201F, 9250F, 1F));
		dao.incluir(new FaixaVariavel("mov", 9251F, 9300F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9301F, 9350F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 9351F, 9400F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 9401F, 9450F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 9451F, 9500F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 9501F, 9550F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 9551F, 9600F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 9601F, 9650F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 9651F, 99999F, 0.1F));
		*/
		dao.incluir(new FaixaVariavel("mov", 0F, 5000F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 5001F, 5500F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 5501F, 6000F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 6001F, 6500F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 6501F, 7000F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 7001F, 7500F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 7501F, 8000F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 8001F, 8500F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 8501F, 9000F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9001F, 9500F, 1F));
		dao.incluir(new FaixaVariavel("mov", 9501F, 10000F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10001F, 10500F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 10501F, 11000F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 11001F, 11500F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 11501F, 12000F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 12001F, 12500F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 12501F, 13000F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 13001F, 13500F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 13501F, 99999F, 0.1F));
		System.out.println("registros de faixas de DUQUE DE CAXIAS carregados");
	}

	private static void carregarCamposDosGoytacazes(FaixaVariavelDao dao) {
		dao.incluir(new FaixaVariavel("eleat", 0F, 77500F, 0.1F));
		dao.incluir(new FaixaVariavel("eleat", 77501F, 82500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 82501F, 87500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 87501F, 92500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 92501F, 97500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 97501F, 102500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 102501F, 107500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 107501F, 112500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 112501F, 117500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 117501F, 122500F, 1F));
		dao.incluir(new FaixaVariavel("eleat", 122501F, 127500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 127501F, 132500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 132501F, 137500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 137501F, 142500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 142501F, 147500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 147501F, 152500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 152501F, 157500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 157501F, 162500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 162501F, 999999F, 0.1F));
		
		dao.incluir(new FaixaVariavel("creleit", 0F, 85000F, 0.1F));
		dao.incluir(new FaixaVariavel("creleit", 85001F, 90000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 90001F, 95000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 95001F, 100000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 100001F, 105000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 105001F, 110000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 110001F, 115000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 115001F, 120000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 120001F, 125000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 125001F, 130000F, 1F));
		dao.incluir(new FaixaVariavel("creleit", 130001F, 135000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 135001F, 140000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 140001F, 145000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 145001F, 150000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 150001F, 155000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 155001F, 160000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 160001F, 165000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 165001F, 170000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 170001F, 999999F, 0.1F));
		
		/*ANTIGA
		dao.incluir(new FaixaVariavel("mov", 0F, 10500F, 	0.1F));
		dao.incluir(new FaixaVariavel("mov", 10501F, 10550F, 	0.2F));
		dao.incluir(new FaixaVariavel("mov", 10551F, 10600F, 	0.3F));
		dao.incluir(new FaixaVariavel("mov", 10601F, 10650F, 	0.4F));
		dao.incluir(new FaixaVariavel("mov", 10651F, 10700F, 	0.5F));
		dao.incluir(new FaixaVariavel("mov", 10701F, 10750F, 	0.6F));
		dao.incluir(new FaixaVariavel("mov", 10751F, 10800F, 	0.7F));
		dao.incluir(new FaixaVariavel("mov", 10801F, 10850F, 	0.8F));
		dao.incluir(new FaixaVariavel("mov", 10851F, 10900F, 	0.9F));
		dao.incluir(new FaixaVariavel("mov", 10901F, 10950F, 	1F));
		dao.incluir(new FaixaVariavel("mov", 10951F, 11000F, 	0.9F));
		dao.incluir(new FaixaVariavel("mov", 11001F, 11050F, 	0.8F));
		dao.incluir(new FaixaVariavel("mov", 11051F, 11100F, 	0.7F));
		dao.incluir(new FaixaVariavel("mov", 11101F, 11150F, 	0.6F));
		dao.incluir(new FaixaVariavel("mov", 11151F, 11200F, 	0.5F));
		dao.incluir(new FaixaVariavel("mov", 11201F, 11250F, 	0.4F));
		dao.incluir(new FaixaVariavel("mov", 11251F, 11300F, 	0.3F));
		dao.incluir(new FaixaVariavel("mov", 11301F, 11350F, 	0.2F));
		dao.incluir(new FaixaVariavel("mov", 11351F, 999999F, 	0.1F));
		*/
		dao.incluir(new FaixaVariavel("mov", 0F, 6690F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 6691F, 7190F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 7191F, 7690F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 7691F, 8190F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 8191F, 8690F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 8691F, 9190F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 9191F, 9690F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 9691F, 10190F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 10191F, 10690F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 10691F, 11190F, 1F));
		dao.incluir(new FaixaVariavel("mov", 11191F, 11690F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 11691F, 12190F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 12191F, 12690F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 12691F, 13190F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 13191F, 13690F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 13691F, 14190F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 14191F, 14690F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 14691F, 15190F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 15191F, 99999F, 0.1F));
		System.out.println("registros de faixas de CAMPOS DOS GOYTACAZES carregados");
	}

	private static void carregarBelfordRoxo(FaixaVariavelDao dao) {
		dao.incluir(new FaixaVariavel("eleat", 0F, 		72500F,  0.1F));
		dao.incluir(new FaixaVariavel("eleat", 72501F, 	77500F,  0.2F));
		dao.incluir(new FaixaVariavel("eleat", 77501F, 	82500F,  0.3F));
		dao.incluir(new FaixaVariavel("eleat", 82501F, 	87500F,  0.4F));
		dao.incluir(new FaixaVariavel("eleat", 87501F, 	92500F,  0.5F));
		dao.incluir(new FaixaVariavel("eleat", 92501F, 	97500F,  0.6F));
		dao.incluir(new FaixaVariavel("eleat", 97501F, 	102500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 102501F, 107500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 107501F, 112500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 112501F, 117500F, 1F));
		dao.incluir(new FaixaVariavel("eleat", 117501F, 122500F, 0.9F));
		dao.incluir(new FaixaVariavel("eleat", 122501F, 127500F, 0.8F));
		dao.incluir(new FaixaVariavel("eleat", 127501F, 132500F, 0.7F));
		dao.incluir(new FaixaVariavel("eleat", 132501F, 137500F, 0.6F));
		dao.incluir(new FaixaVariavel("eleat", 137501F, 142500F, 0.5F));
		dao.incluir(new FaixaVariavel("eleat", 142501F, 147500F, 0.4F));
		dao.incluir(new FaixaVariavel("eleat", 147501F, 152500F, 0.3F));
		dao.incluir(new FaixaVariavel("eleat", 152501F, 157500F, 0.2F));
		dao.incluir(new FaixaVariavel("eleat", 157501F, 999999F, 0.1F));
		
		dao.incluir(new FaixaVariavel("creleit", 0F,	 83000F, 0.1F));
		dao.incluir(new FaixaVariavel("creleit", 83001F, 88000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 88001F, 93000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 93001F, 98000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 98001F, 103000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 103001F,108000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 108001F,113000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 113001F,118000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 118001F,123000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 123001F,128000F, 1F));
		dao.incluir(new FaixaVariavel("creleit", 128001F,133000F, 0.9F));
		dao.incluir(new FaixaVariavel("creleit", 133001F,138000F, 0.8F));
		dao.incluir(new FaixaVariavel("creleit", 138001F,143000F, 0.7F));
		dao.incluir(new FaixaVariavel("creleit", 143001F,148000F, 0.6F));
		dao.incluir(new FaixaVariavel("creleit", 148001F,153000F, 0.5F));
		dao.incluir(new FaixaVariavel("creleit", 153001F,158000F, 0.4F));
		dao.incluir(new FaixaVariavel("creleit", 158001F,163000F, 0.3F));
		dao.incluir(new FaixaVariavel("creleit", 163001F,168000F, 0.2F));
		dao.incluir(new FaixaVariavel("creleit", 168001F,999999F, 0.1F));
		
		/* antiga
		dao.incluir(new FaixaVariavel("mov", 0F, 	 10850F, 	0.1F));
		dao.incluir(new FaixaVariavel("mov", 10851F, 10900F, 	0.2F));
		dao.incluir(new FaixaVariavel("mov", 10901F, 10950F, 	0.3F));
		dao.incluir(new FaixaVariavel("mov", 10951F, 11000F, 	0.4F));
		dao.incluir(new FaixaVariavel("mov", 11001F, 11050F, 	0.5F));
		dao.incluir(new FaixaVariavel("mov", 11051F, 11100F, 	0.6F));
		dao.incluir(new FaixaVariavel("mov", 11101F, 11150F, 	0.7F));
		dao.incluir(new FaixaVariavel("mov", 11151F, 11200F, 	0.8F));
		dao.incluir(new FaixaVariavel("mov", 11201F, 11250F, 	0.9F));
		dao.incluir(new FaixaVariavel("mov", 11251F, 11300F, 	1F));
		dao.incluir(new FaixaVariavel("mov", 11301F, 11350F, 	0.9F));
		dao.incluir(new FaixaVariavel("mov", 11351F, 11400F, 	0.8F));
		dao.incluir(new FaixaVariavel("mov", 11401F, 11450F, 	0.7F));
		dao.incluir(new FaixaVariavel("mov", 11451F, 11500F, 	0.6F));
		dao.incluir(new FaixaVariavel("mov", 11501F, 11550F, 	0.5F));
		dao.incluir(new FaixaVariavel("mov", 11551F, 11600F, 	0.4F));
		dao.incluir(new FaixaVariavel("mov", 11601F, 11650F, 	0.3F));
		dao.incluir(new FaixaVariavel("mov", 11651F, 11700F, 	0.2F));
		dao.incluir(new FaixaVariavel("mov", 11701F, 99999F, 	0.1F));
		*/
		dao.incluir(new FaixaVariavel("mov", 0F, 7000F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 7001F, 7500F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 7501F, 8000F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 8001F, 8500F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 8501F, 9000F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 9001F, 9500F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 9501F, 10000F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 10001F, 10500F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 10501F, 11000F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 11001F, 11500F, 1F));
		dao.incluir(new FaixaVariavel("mov", 11501F, 12000F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 12001F, 12500F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 12501F, 13000F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 13001F, 13500F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 13501F, 14000F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 14001F, 14500F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 14501F, 15000F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 15001F, 15500F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 15501F, 99999F, 0.1F));
		
		System.out.println("registros de faixas de BELFORD ROXO carregados");
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
		
		/* ANTIGA
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
		*/
		dao.incluir(new FaixaVariavel("mov", 0F, 4250F, 0.1F));
		dao.incluir(new FaixaVariavel("mov", 4251F, 4750F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 4751F, 5250F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 5251F, 5750F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 5751F, 6250F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 6251F, 6750F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 6751F, 7250F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 7251F, 7750F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 7751F, 8250F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 8251F, 8750F, 1F));
		dao.incluir(new FaixaVariavel("mov", 8751F, 9250F, 0.9F));
		dao.incluir(new FaixaVariavel("mov", 9251F, 9750F, 0.8F));
		dao.incluir(new FaixaVariavel("mov", 9751F, 10250F, 0.7F));
		dao.incluir(new FaixaVariavel("mov", 10251F, 10750F, 0.6F));
		dao.incluir(new FaixaVariavel("mov", 10751F, 11250F, 0.5F));
		dao.incluir(new FaixaVariavel("mov", 11251F, 11750F, 0.4F));
		dao.incluir(new FaixaVariavel("mov", 11751F, 12250F, 0.3F));
		dao.incluir(new FaixaVariavel("mov", 12251F, 12750F, 0.2F));
		dao.incluir(new FaixaVariavel("mov", 12751F, 99999F, 0.1F));
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
		
		//BELFORD ROXO
		dao.incluir(new Zona(152,"BELFORD ROXO", 0f, 0f, 97636, 104013	, 7897));
		dao.incluir(new Zona(153,"BELFORD ROXO", 0f, 0f, 76474, 82908	, 7104));
		dao.incluir(new Zona(154,"BELFORD ROXO", 0f, 0f, 72054, 76881	, 7523));
		dao.incluir(new Zona(155,"BELFORD ROXO", 0f, 0f, 82725, 91852	, 7915));
		
		//CAMPOS DOS GOYTACAZES
		dao.incluir(new Zona(75,"CAMPOS DOS GOYTACAZES", 0f, 0f, 58531, 62662, 5145));
		dao.incluir(new Zona(76,"CAMPOS DOS GOYTACAZES", 0f, 0f, 59730, 63720, 6019));
		dao.incluir(new Zona(98,"CAMPOS DOS GOYTACAZES", 0f, 0f, 54019, 56301, 4689));
		dao.incluir(new Zona(99,"CAMPOS DOS GOYTACAZES", 0f, 0f, 37756, 39383, 3291));
		dao.incluir(new Zona(100,"CAMPOS DOS GOYTACAZES", 0f, 0f, 36963, 40016, 2906));
		dao.incluir(new Zona(129,"CAMPOS DOS GOYTACAZES", 0f, 0f, 62841, 69407, 5664));
		dao.incluir(new Zona(249,"CAMPOS DOS GOYTACAZES", 0f, 0f, 49693, 50517, 5103));
		
		//DUQUE DE CAXIAS
		dao.incluir(new Zona(126,"DUQUE DE CAXIAS", 0f, 0f, 101840, 111570, 8733));
		dao.incluir(new Zona(66	,"DUQUE DE CAXIAS", 0f, 0f, 37200, 37094, 3346));
		dao.incluir(new Zona(77	,"DUQUE DE CAXIAS", 0f, 0f, 33446, 33437, 2417));
		dao.incluir(new Zona(78	,"DUQUE DE CAXIAS", 0f, 0f, 73970, 76388, 5700));
		dao.incluir(new Zona(79	,"DUQUE DE CAXIAS", 0f, 0f, 89645, 98807, 8171));
		dao.incluir(new Zona(103,"DUQUE DE CAXIAS", 0f, 0f, 63463, 63275, 5437));
		dao.incluir(new Zona(127,"DUQUE DE CAXIAS", 0f, 0f, 87813, 97877, 8550));
		dao.incluir(new Zona(128,"DUQUE DE CAXIAS", 0f, 0f, 57802, 64216, 5026));
		dao.incluir(new Zona(194,"DUQUE DE CAXIAS", 0f, 0f, 39540, 41037, 3315));
		dao.incluir(new Zona(200,"DUQUE DE CAXIAS", 0f, 0f, 43881, 46414, 4271));
		
		//NOVA IGUACU
		dao.incluir(new Zona(84,"NOVA IGUACU", 0f, 0f, 120564, 137169, 13780));
		dao.incluir(new Zona(27,"NOVA IGUACU", 0f, 0f, 43516, 43364, 3208));
		dao.incluir(new Zona(67,"NOVA IGUACU", 0f, 0f, 42248, 42012, 3240));
		dao.incluir(new Zona(82,"NOVA IGUACU", 0f, 0f, 42510, 43733, 3391));
		dao.incluir(new Zona(156,"NOVA IGUACU", 0f, 0f, 71998, 81555, 7765));
		dao.incluir(new Zona(157,"NOVA IGUACU", 0f, 0f, 90850, 97455, 8021));
		dao.incluir(new Zona(158,"NOVA IGUACU", 0f, 0f, 50590, 55136, 4520));
		dao.incluir(new Zona(159,"NOVA IGUACU", 0f, 0f, 77546, 82045, 6519));
		dao.incluir(new Zona(250,"NOVA IGUACU", 0f, 0f, 44712, 48373, 3845));
		
		//PETROPOLIS
		dao.incluir(new Zona(29,"PETROPOLIS", 0f, 0f, 59224, 60873, 5181));
		dao.incluir(new Zona(65,"PETROPOLIS", 0f, 0f, 60270, 64497, 5170));
		dao.incluir(new Zona(85,"PETROPOLIS", 0f, 0f, 40584, 41691, 3251));
		dao.incluir(new Zona(226,"PETROPOLIS", 0f, 0f, 40094, 43525, 3560));
		dao.incluir(new Zona(227,"PETROPOLIS", 0f, 0f, 43688, 44984, 4123));
		
		//SAO GONCALO
		dao.incluir(new Zona(36,"SAO GONCALO", 0f, 0f, 49987, 49685, 4101));
		dao.incluir(new Zona(68,"SAO GONCALO", 0f, 0f, 53274, 55668, 4141));
		dao.incluir(new Zona(69,"SAO GONCALO", 0f, 0f, 82302, 93737, 7822));
		dao.incluir(new Zona(86,"SAO GONCALO", 0f, 0f, 30913, 30779, 2256));
		dao.incluir(new Zona(87,"SAO GONCALO", 0f, 0f, 64465, 66653, 5157));
		dao.incluir(new Zona(132,"SAO GONCALO", 0f, 0f, 88329, 99595, 8732));
		dao.incluir(new Zona(133,"SAO GONCALO", 0f, 0f, 68026, 74627, 5890));
		dao.incluir(new Zona(134,"SAO GONCALO", 0f, 0f, 38353, 38436, 2420));
		dao.incluir(new Zona(135,"SAO GONCALO", 0f, 0f, 65738, 69927, 5744));
		dao.incluir(new Zona(136,"SAO GONCALO", 0f, 0f, 49311, 51619, 4313));
		dao.incluir(new Zona(137,"SAO GONCALO", 0f, 0f, 59528, 59189, 4340));
		dao.incluir(new Zona(197,"SAO GONCALO", 0f, 0f, 35589, 35597, 2547));
		
		//SAO JOAO DE MERITI
		dao.incluir(new Zona(46, "SAO JOAO DE MERITI", 0f, 0f, 35278, 33778, 2185));
		dao.incluir(new Zona(88, "SAO JOAO DE MERITI", 0f, 0f, 70703, 74184, 5439));
		dao.incluir(new Zona(89, "SAO JOAO DE MERITI", 0f, 0f, 77293, 82647, 6445));
		dao.incluir(new Zona(145, "SAO JOAO DE MERITI", 0f, 0f, 52881, 54496, 3766));
		dao.incluir(new Zona(186,"SAO JOAO DE MERITI", 0f, 0f, 68005, 72039, 5449));
		dao.incluir(new Zona(187,"SAO JOAO DE MERITI", 0f, 0f, 64712, 68298, 5197));
		
		//VOLTA REDONDA
		dao.incluir(new Zona(47, "VOLTA REDONDA", 0f, 0f, 60877, 61632, 5975));
		dao.incluir(new Zona(90, "VOLTA REDONDA", 0f, 0f, 49800, 53383, 4861));
		dao.incluir(new Zona(131, "VOLTA REDONDA", 0f, 0f, 64732, 64588, 5239));
		dao.incluir(new Zona(202, "VOLTA REDONDA", 0f, 0f, 47723, 47576, 4384));
		
		em.getTransaction().commit();
		em.close();
		System.out.println("registros de zonas inseridos");
	}

	public static void carregarDadosBasicos() {
		carregarDadosZonas();
		carregarFaixasDeVariaveis();		
	}

}
