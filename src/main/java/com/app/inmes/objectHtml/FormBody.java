/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.app.inmes.objectHtml;
import com.app.inmes.pregunta.PreguntaDTO;

/**
 *
 * @author Edward Reyes
 */
public class FormBody {

    public static String headerAndOther(PreguntaDTO pregunta) {
        String cabeceraPregunta = " <div class=\"card bg-light mb-3\" style=\"width: 100%;\"><div class=\"card-body\">"
                + "        <br/><section class=\"row\">"
                + "        <section class=\"col-md-12\">\n"
                + "        <h6>" + pregunta.getNoPregunta() + ".- " + pregunta.getPregunta() + "</h6>\n"
                + "      </section></section><br/>";
        return cabeceraPregunta;
    }

    public static String siguiente() {
        return "<input type=\"submit\" class=\"btn btn-success\" value=\"Siguiente\"></form>\n"
                + " </div> </div><br/>\n";
    }

    public static String finalizarEncuesta() {
        return "    <div>\n"
                + "      <section class=\"col-md-12\">\n"
                + "        <h4 class=\"text-center\">HAS TERMINADO LA ENCUESTA</h4>\n"
                + "        <p></p>\n"
                + "      </section>\n"
                + "    </section><br/>\n"
                + "  <form method=\"post\" action=\"finalizaEncuesta\" >\n"
                + "        <center><input type=\"submit\" class=\"btn btn-success\" value=\"Finalizar\">\n"
                + "        <a href=\"../\">Regresar</a>\n"
                + "        </center></form></div>\n"
                + "        <br/>\n"
                + "        <br/>\n";
    }

    public static String sinEncuesta() {
        return "    <div>\n"
                + "      <section class=\"col-md-12\">\n"
                + "        <h4 class=\"text-center\">NO HAY ENCUESTA</h4>\n"
                + "        <p></p>\n"
                + "      </section>\n"
                + "    </section><br/>\n"
                + "        <center>\n"
                + "        <a href=\"../encuestas\">Regresar</a>\n"
                + "        </center></div>\n"
                + "        <br/>\n"
                + "        <br/>\n";
    }

    public static String capitulo(String tituloCuestionario, String tituloCapitulo, int noCapitulo) {
        return " <div>\n"
                + "    <div class=\"card mb-3 bg-light\" style=\"width: 100%;\"><div class=\"card-body\">"
                + "    <section class=\"row\">\n"
                + "      <div class=\"col-md-12\">\n"
                + "        <h2 class=\"text-center\">"
                + tituloCuestionario
                + "        </h2>\n"
                + "        <h6 class=\"text-center\">Sistema de cuestionarios de inmuebles.</h5>\n"
                + "      </div>\n"
                + "    </section>\n"
                + "    </div></div><br />\n"
                //tab de capitulo
                + " <section class=\"col-md-12\">\n"
                + "        <h4 class=\"text-center\">"
                + tituloCapitulo
                + "        </h4>\n"
                + "        <p></p>\n"
                + "      </section>\n"
                + "    </section><br/>"
                + " <form class=\"needs-validation\" "
                + "  novalidate method=\"post\" "
                + "  action=\"updateEncuesta/" + noCapitulo + "\" object=\"objectRespuestas\" >\n";
    }

    public static String subCapitulo(String subcapitulo) {
        return " <section class=\"row\">\n"
                + "      <section class=\"col-md-12\">\n"
                + "        <h5 class=\"text-center\">"
                + subcapitulo
                + "        </h5>\n"
                + "        <p></p>\n"
                + "      </section>\n"
                + "    </section>";
    }

}
