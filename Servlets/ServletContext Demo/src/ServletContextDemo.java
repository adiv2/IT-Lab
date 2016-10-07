import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * ServletContext
 * Created by Aditya Gholba on 4/8/16.
 */
@WebServlet(name = "ServletContextDemo")
public class ServletContextDemo extends HttpServlet
{
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        ServletContext sc = getServletContext();
        String uname = sc.getInitParameter("Username");
        String nerd = sc.getInitParameter("Nerd");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1> UserName "+uname+"</h1>");
        out.println("<h1> Nerd "+nerd+"</h1>");
        out.println("<html>\n" +
                "<head>\n" +
                "<title>Nisiki India</title>\n" +
                "<link rel=\"shortcut icon\" type=\"image/x-icon\" href=\"NisikiOld/fav-icon.png\" />\n" +
                "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
                "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\n" +
                "<meta name=\"Description\" content=\"Nisiki India Private Limited - Manufacturers and suppliers of ball bearings, deep groove ball bearing, angular contact ball bearings, double row ball bearings, auto engine bearings, bearings, machine bearings, motor bearings, cylindrical roller bearings, integral shaft bearings, industrial bearings, spherical roller bearings, double row ball bearings, radial ball bearings and single row deep groove radial ball bearings, loadcells, blowers, water pump bearings, hub bearings, commutators, thermostats, axial fans, centrifugal fans, thermal overload protectors, motors, fans, india.\"> \n" +
                "  <meta name=\"Keywords\" content=\"ball bearings, deep groove ball bearing, angular contact ball bearings, double row ball bearings supplier, ball bearings manufacturer, deep groove ball bearing supplier, angular contact ball bearings suppliers, ball bearings supplier, ball bearings manufacturer, ball bearings exporters, deep groove ball bearing supplier, ball bearings supplier, deep groove ball bearings supplier, ball bearings exporter, ball bearings manufacturers, ball bearings suppliers, ball bearings exporters, bearings exporters, deep groove ball bearings manufacturers, bearings manufacturers, deep groove ball bearings suppliers, deep groove ball bearings exporters, radial ball bearings supplier, double row ball bearings supplier, single row deep groove radial ball bearings suppliers, koyo bearings, nisiki bearings, nmb bearings, nisiki, blowers, water pump bearings, hub bearings, commutators, thermostats, axial fans, centrifugal fans, thermal overload protectors, stepper motors, motors, fans, india\">\n" +
                "  <meta name=\"robots\" content=\"index,follow\">  \n" +
                "<script type=\"application/x-javascript\"> addEventListener(\"onclick\", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>\n" +
                "  <!-- font links -->\n" +
                "  <link href='//fonts.googleapis.com/css?family=Varela+Round' rel='stylesheet' type='text/css'>\n" +
                "  <link href='//fonts.googleapis.com/css?family=Open+Sans:400,300,600,700,800' rel='stylesheet' type='text/css'>\n" +
                "  <!-- /font links -->\n" +
                "  <!-- css links -->\n" +
                "<link href=\"css/bootstrap.min.css\" rel=\"stylesheet\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n" +
                "<link href=\"css/owl.carousel.css\" rel=\"stylesheet\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n" +
                "<link href=\"css/popuo-box.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n" +
                "<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\n" +
                "<!-- /css links -->\n" +
                "  <!-- js links -->\n" +
                "  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/smoothscroll/1.4.0/SmoothScroll.min.js\"></script>\n" +
                "  <script src=\"js/jquery.min.js\"></script>\n" +
                "  <script src=\"js/bootstrap.min.js\"></script>\n" +
                "  <!-- /js links -->\n" +
                "\t<!-- js for portfolio  -->\n" +
                "\t<script>\n" +
                "\t\t\t\t$(document).ready(function() {\n" +
                "\t\t\t\t\t$(\"#owl-demo\").owlCarousel({\n" +
                "\t\t\t\t\t\titems : 5,\n" +
                "\t\t\t\t\t\tlazyLoad : true,\n" +
                "\t\t\t\t\t\tautoPlay : true,\n" +
                "\t\t\t\t\t\tpagination : false,\n" +
                "\t\t\t\t\t});\n" +
                "\t\t\t\t});\n" +
                "\t\t\t</script>\n" +
                "\t<!-- js for portfolio  -->\t\t\n" +
                "</head>\n" +
                "<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\" data-offset=\"60\">\n" +
                "<nav class=\"navbar navbar-inverse navbar-fixed-top\">\n" +
                "\t<div class=\"container\">\n" +
                "\t\t<div class=\"navbar-header\">\n" +
                "\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\" >\n" +
                "\t\t\t\t<span class=\"icon-bar\"></span>\n" +
                "\t\t\t\t<span class=\"icon-bar\"></span>\n" +
                "\t\t\t\t<span class=\"icon-bar\"></span>                        \n" +
                "\t\t\t</button>\n" +
                "\t\t\t<a class=\"navbar-brand\" href=\"/Nisiki/\">Nisiki India</a>\n" +
                "\t\t</div>\n" +
                "\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\n" +
                "\t\t\t<ul class=\"nav navbar-nav navbar-right\">\n" +
                "\t\t\t\t<li><a href=/Nisiki/CorePhilosophy.html>Core Philosophy</a></li>\n" +
                "\t\t\t\t<li><a href=/Nisiki/Products.html>Products</a></li>\n" +
                "\t\t\t\t<li class=\"active\"><a href=/Nisiki/Clientele.html>Clientele</a></li>\n" +
                "\t\t\t\t<li><a href=/Nisiki/Network.html>Network</a></li>\n" +
                "\t\t\t\t<li><a href=/Nisiki/AboutUs.html>About us</a></li>\n" +
                "\t\t\t</ul>\n" +
                "\t\t</div>\n" +
                "\t</div>\n" +
                "</nav>\n" +
                "<!-- banner -->\n" +
                "<!--<div class=\"banner\" style=\"height=90%;\">\n" +
                "</div>-->\n" +
                "</br></br>\n" +
                "<div class=\"about-us\" id=\"about\">\n" +
                "\t<div class=\"container\">\t\t\n" +
                "\t\t<div class=\"row\">\n" +
                "\t\t\t<div class=\"col-sm-6 text-center  about1\">\n" +
                "\t\t\t\t<h4>Our Clients</h4>\n" +
                "\t\t\t\t<hr>\n" +
                "\t\t\t\t<p class=\"p1\"><strong> Since 1992, NISIKI has transformed the traditional manufacturing model of electro-mechanical components to continually provide better VALUE than the nearest competitor. Quality is ... Free of Costs. Reliability is NISIKIs business.\n" +
                "</strong> </p>\n" +
                "\t\t\t\t<p class=\"p1\"> Nisiki supplied components are on the purchasing list of over 200 OEM customers (machine makers). Once on the purchasing list, our customers have shown continued loyalty over many years and product cycles, supporting us with increasing share of business (SOB) for Nisiki components.</p>\n" +
                "\t\t\t</div> \n" +
                "\t\t\t\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\t</div>\t\n" +
                "</div>\n" +
                "</br></br>\n" +
                "\n" +
                "<img src=\"images/cust_logo.jpg\" style=\"width:100%; max-height:700px\">\n" +
                "</br></br>\n" +
                "<div class=\"about-us\" id=\"about\">\n" +
                "\t<div class=\"container\">\t\t\n" +
                "\t\t<div class=\"row\">\n" +
                "\t\t\t<div class=\"col-sm-6 text-center about1\">\n" +
                "\t\t\t\t<h4>Our Clients</h4>\n" +
                "\t\t\t\t<hr>\n" +
                "\t\t\t\t<ol style=\"list-style-type:disc; text-align:left;\">\n" +
                "                      <li>\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">LARSEN &amp; TOUBRO&nbsp; LTD.</font></p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">PORTESCAP (A DANAHER MOTION COMPANY) </font>\n" +
                "                      </p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">LUCAS TVS LTD.</font></p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">PIAGGIO VEHICLES PVT. LTD.</font></p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">RANE TRW STEERING SYSTEMS LTD.</font></p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">JKM DAERIM&nbsp; AUTO LTD.</font></p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">KINETIC ENGG. LTD.</font></p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">KURUSHETRA AUTOMOBILES PVT. LTD.</font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">Rasandik Engg Ind. India Ltd ,NOIDA</font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">Kurushetra Automobiles Ltd,Kurushetra</font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">JS Auto Pvt Ltd , KANPUR&nbsp;</font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">Kranti Automobiles Ltd , Haridwar</font></p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">IFB GROUP</font></p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">KIRLOSKAR PUMP </font></p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">HIMSON TEXTILES ENGG. INDIA PVT. LTD.</font></p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">BAJAJ AUTO LTD.</font></p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">TELCO (TACO) </font> </p></li>\n" +
                "                      <li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">BHARAT EARTH MOVERS LTD.</font></p></li>\n" +
                "                      <li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">TVS - SUZUKI \n" +
                "\t\t\t\t\t\t</font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">WEP PERIPHERALS LTD\n" +
                "\t\t\t\t\t\t</font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">SIEMENS </font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <font size=\"3\" face=\"Verdana\" color=\"#666666\">XYRIX ELECTRONICS PVT. LTD.<br>\n" +
                "                      (Minebea Shanghai)</font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "                      <p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "                      <span class=\"081020207-30082006\">\n" +
                "\t\t\t\t\t\t<span style=\"text-transform: uppercase\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">EMERSON NETWORK POWER INDIA PVT LTD.</font></span></span></p></li>\n" +
                "                    \t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">PROSOUND PRODUCTS&nbsp; </font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">ITI LTD.&nbsp; (ALCATEL) </font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">SANSUI ELECTRONICS </font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">NITIRAJ ENGINEERS PVT. LTD.</font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">CONWEIGH ELECTRONICS </font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">LEOTRONIC SCALES </font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">KULKARNI POWER TOOLS LTD.</font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">KIRLOSKAR TOYODA </font>\n" +
                "\t\t\t\t\t\t</p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">GENERAL MOTORS </font>\n" +
                "\t\t\t\t\t\t</p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">MAINI MATERIALS MOVEMENTS PVT. LTD.</font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<font color=\"#666666\">\n" +
                "\t\t\t\t\t\t<font face=\"Century Gothic\">\n" +
                "\t\t\t\t\t\t<span class=\"081020207-30082006\">\n" +
                "\t\t\t\t\t\t<span style=\"TEXT-TRANSFORM: uppercase; FONT-FAMILY: Verdana\">\n" +
                "\t\t\t\t\t\t<font size=\"3\">spectra motors</font></span></span></font><font size=\"3\" face=\"Verdana\">\n" +
                "\t\t\t\t\t\t</font></font></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\" align=\"left\">\n" +
                "\t\t\t\t\t\t<span class=\"081020207-30082006\">\n" +
                "\t\t\t\t\t\t<span style=\"text-transform: uppercase\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">TATA CONSULTANCY SERVICES</font></span></span></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<span class=\"081020207-30082006\">\n" +
                "\t\t\t\t\t\t<span style=\"text-transform: uppercase\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">ALIDHRA GROUP</font></span></span></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<span class=\"081020207-30082006\">\n" +
                "\t\t\t\t\t\t<span style=\"text-transform: uppercase\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">RELIANCE INDUSTRIES LTD.</font></span></span></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<span class=\"081020207-30082006\">\n" +
                "\t\t\t\t\t\t<span style=\"text-transform: uppercase\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">BALLARPUR INDUSTRIES LTD.</font></span></span></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<span class=\"081020207-30082006\">\n" +
                "\t\t\t\t\t\t<span style=\"text-transform: uppercase\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">ULTRA TECH \n" +
                "\t\t\t\t\t\t</font></span></span></p></li>\n" +
                "\t\t\t\t\t\t<li>\n" +
                "\t\t\t\t\t\t<p style=\"margin-left: 10; margin-right: 10; margin-top: 5; margin-bottom: 0\">\n" +
                "\t\t\t\t\t\t<span class=\"081020207-30082006\">\n" +
                "\t\t\t\t\t\t<span style=\"text-transform: uppercase\">\n" +
                "\t\t\t\t\t\t<font size=\"3\" face=\"Verdana\" color=\"#666666\">TELCON</font></span></span></p></li>\n" +
                "                    \n" +
                "</ol>\n" +
                "\t\n" +
                "\t\t\t</div> \n" +
                "\t\t\t\n" +
                "\t\t\t</div>\n" +
                "\t\t</div>\n" +
                "\t</div>\t\n" +
                "</div>\n" +
                "<!-- Footer -->\n" +
                "<footer class=\"footer-distributed\">\n" +
                "\t<div class=\"container\">\t\t\n" +
                "\t\t<div class=\"row\">\n" +
                "\t\t\t\n" +
                "\t\t<hr>\n" +
                "\t\t<div class=\"copyright\">\n" +
                "\t\t\t<!--<p class=\"text-center\">© 2016 Entrepreneur. All Rights Reserved | Design by <a href=\"http://w3layouts.com\" target=\"_blank\">W3layouts</a></p>-->\n" +
                "\t\t</div>\n" +
                "\t\t<a href=\"#myPage\" title=\"To Top\"><span class=\"glyphicon glyphicon-chevron-up\"></span></a>\n" +
                "\t</div>\t\n" +
                "</footer>\n" +
                "<!-- /Footer -->\n" +
                "<!-- js for portfolio popup -->\n" +
                "<script>\n" +
                "\t\t\t\t\t\t$(document).ready(function() {\n" +
                "\t\t\t\t\t\t$('.popup-with-zoom-anim').magnificPopup({\n" +
                "\t\t\t\t\t\t\ttype: 'inline',\n" +
                "\t\t\t\t\t\t\tfixedContentPos: false,\n" +
                "\t\t\t\t\t\t\tfixedBgPos: true,\n" +
                "\t\t\t\t\t\t\toverflowY: 'auto',\n" +
                "\t\t\t\t\t\t\tcloseBtnInside: true,\n" +
                "\t\t\t\t\t\t\tpreloader: false,\n" +
                "\t\t\t\t\t\t\tmidClick: true,\n" +
                "\t\t\t\t\t\t\tremovalDelay: 300,\n" +
                "\t\t\t\t\t\t\tmainClass: 'my-mfp-zoom-in'\n" +
                "\t\t\t\t\t\t});\n" +
                "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\n" +
                "\t\t\t\t\t\t});\n" +
                "\t\t</script>\n" +
                "\t\t<script src=\"js/owl.carousel.js\"></script>\n" +
                "\t\t<script src=\"js/jquery.magnific-popup.js\" type=\"text/javascript\"></script>\n" +
                "\t\t<!-- /js for portfolio popup -->\n" +
                "\t\t<!-- carousel -->\n" +
                "\t\t<script>\n" +
                "$(document).ready(function(){\n" +
                "    // Activate Carousel\n" +
                "    $(\"#myCarousel\").carousel({interval: 5000, pause: \"hover\"});\n" +
                "    \n" +
                "    // Enable Carousel Indicators\n" +
                "    $(\".item1\").click(function(){\n" +
                "        $(\"#myCarousel\").carousel(0);\n" +
                "    });\n" +
                "    $(\".item2\").click(function(){\n" +
                "        $(\"#myCarousel\").carousel(1);\n" +
                "    });\n" +
                "    $(\".item3\").click(function(){\n" +
                "        $(\"#myCarousel\").carousel(2);\n" +
                "    });\n" +
                "    $(\".item4\").click(function(){\n" +
                "        $(\"#myCarousel\").carousel(3);\n" +
                "    });\n" +
                "    \n" +
                "    // Enable Carousel Controls\n" +
                "    $(\".left\").click(function(){\n" +
                "        $(\"#myCarousel\").carousel(\"prev\");\n" +
                "    });\n" +
                "    $(\".right\").click(function(){\n" +
                "        $(\"#myCarousel\").carousel(\"next\");\n" +
                "    });\n" +
                "});\n" +
                "</script>\n" +
                "<!-- /carousel -->\n" +
                "<!-- nav sliding -->\n" +
                "<script>\n" +
                "$(document).ready(function(){\n" +
                "  // Add smooth scrolling to all links in navbar + footer link\n" +
                "  $(\".navbar a, footer a[href='#myPage']\").on('click', function(event) {\n" +
                "\n" +
                "  // Store hash\n" +
                "  var hash = this.hash;\n" +
                "\n" +
                "  // Using jQuery's animate() method to add smooth page scroll\n" +
                "  // The optional number (900) specifies the number of milliseconds it takes to scroll to the specified area\n" +
                "  $('html, body').animate({\n" +
                "    scrollTop: $(hash).offset().top\n" +
                "  }, 900, function(){\n" +
                "\n" +
                "    // Add hash (#) to URL when done scrolling (default click behavior)\n" +
                "    window.location.hash = hash;\n" +
                "    });\n" +
                "  });\n" +
                "})\n" +
                "</script>\t\t\n" +
                "<!-- /nav sliding -->\n" +
                "<!-- js for slideanim -->\n" +
                "<script>\n" +
                "$(window).scroll(function() {\n" +
                "  $(\".slideanim\").each(function(){\n" +
                "    var pos = $(this).offset().top;\n" +
                "\n" +
                "    var winTop = $(window).scrollTop();\n" +
                "    if (pos < winTop + 600) {\n" +
                "      $(this).addClass(\"slide\");\n" +
                "    }\n" +
                "  });\n" +
                "});\n" +
                "</script>\n" +
                "<!-- /js for slideanim -->\n" +
                "</body>\n" +
                "</html>\n");

    }
}
