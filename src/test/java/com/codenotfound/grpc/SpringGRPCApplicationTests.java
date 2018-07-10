package com.codenotfound.grpc;

import static org.assertj.core.api.Assertions.assertThat;

import com.codenotfound.grpc.client.util.Util;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.codenotfound.grpc.client.GrpcClient;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.logging.Level;
import java.util.logging.Logger;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringGRPCApplicationTests {

    private static final Logger log = Logger.getLogger(SpringGRPCApplicationTests.class.getName());

    @Autowired
    private GrpcClient helloWorldClient;

    @Autowired
    private Util util;

    @Test
    public void callChamadaUm() {

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaUm();

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-UM]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-UM]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-UM]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }

    @Test
    public void callChamadaDois() {

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaDois(1);

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-DOIS]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-DOIS]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-DOIS]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }

    @Test
    public void callChamadaTres() {

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaTres(1, 2, 3, 4, 5, 6, 7, 8);

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-TRES]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-TRES]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-TRES]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }

    @Test
    public void callChamadaQuatrosUmCaracter() {

        log.info("[CHAMADA-QUATRO]-[UM CARACTERES]");

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaQuatro("A");

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-QUATRO]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-QUATRO]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-QUATRO]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }


    @Test
    public void callChamadaQuatrosDoisCaracteres() {

        log.info("[CHAMADA-QUATRO]-[DOIS CARACTERES]");

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaQuatro("AB");

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-QUATRO]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-QUATRO]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-QUATRO]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }


    @Test
    public void callChamadaQuatrosQuatroCaracteres() {

        log.info("[CHAMADA-QUATRO]-[QUATRO CARACTERES]");

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaQuatro("ABCD");

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-QUATRO]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-QUATRO]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-QUATRO]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }

    @Test
    public void callChamadaQuatrosOitoCaracteres() {

        log.info("[CHAMADA-QUATRO]-[OITO CARACTERES]");

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaQuatro("ABCDABCD");

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-QUATRO]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-QUATRO]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-QUATRO]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }

    @Test
    public void callChamadaQuatrosDezesseisCaracteres() {

        log.info("[CHAMADA-QUATRO]-[16 CARACTERES]");

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaQuatro("ABCDABCDABCDABCD");

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-QUATRO]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-QUATRO]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-QUATRO]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }

    @Test
    public void callChamadaQuatrosTrintaEDoisCaracteres() {

        log.info("[CHAMADA-QUATRO]-[32 CARACTERES]");

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaQuatro("ABCDABCDABCDABCDABCDABCDABCDABCD");

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-QUATRO]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-QUATRO]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-QUATRO]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }


    @Test
    public void callChamadaQuatrosSessentaEQuatroCaracteres() {

        log.info("[CHAMADA-QUATRO]-[64 CARACTERES]");

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaQuatro("ABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCD");

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-QUATRO]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-QUATRO]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-QUATRO]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }

    @Test
    public void callChamadaQuatrosUmDoisOitoCaracteres() {

        log.info("[CHAMADA-QUATRO]-[128 CARACTERES]");

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaQuatro("ABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCD");

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-QUATRO]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-QUATRO]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-QUATRO]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }

    @Test
    public void callChamadaQuatrosDoisCincoMeiaCaracteres() {

        log.info("[CHAMADA-QUATRO]-[256 CARACTERES]");

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaQuatro("ABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCD");

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-QUATRO]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-QUATRO]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-QUATRO]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }

    @Test
    public void callChamadaCinco() {

        log.info("[CHAMADA-QUATRO]-[256 CARACTERES]");

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.callChamadaQuatro("ABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCDABCD");

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-QUATRO]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-QUATRO]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-QUATRO]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }

    @Test
    public void chamadaCinco() {

        double[] resultados = new double[10];

        for (int i = 1; i <= 10; i++) {

            BigDecimal tempoInicial = BigDecimal.valueOf(System.currentTimeMillis());

            helloWorldClient.sayHello("John", "Doe");

            BigDecimal tempoFinal = BigDecimal.valueOf(System.currentTimeMillis());
            BigDecimal resultado = tempoFinal.subtract(tempoInicial);

            resultados[i - 1] = Double.valueOf(resultado.toString());
            log.info("[CHAMADA-CINCO]-[LOOP]-[" + i + "]-[TEMPO-DE-EXECUCAO]-[" + resultado + " ms]");
        }

        log.info("[CHAMADA-CINCO]-[MEDIA-EXECUCOES]-[" + util.calculaMedia(util.removeExtremos(resultados)) + "]");
        log.info("[CHAMADA-CINCO]-[DESVIO-PADRAO]-[" + util.calculaDesvioPadrao(util.removeExtremos(resultados)) + "]");
    }

}
