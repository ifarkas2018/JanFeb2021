package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import miscellaneous.LesenMethoden;
import java.util.Enumeration;
import miscellaneous.LesenMethoden;

public final class error_005fsucc_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/header.jsp");
    _jspx_dependants.add("/footer.jsp");
  }

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!-- error_succ.jsp adds the error or success message to the web page -->\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        ");

            HttpSession hSession = LesenMethoden.returnSession(request);
            // the name of the page to return to if the user enters the email (subscribe) 
            hSession.setAttribute("webpg_name", "error_succ.jsp");
            // reseting the sess. var to the default: if the user just did do the subscribe, the form on the NEXT web page DOESN'T NEED 
            // to show the previous values 
            hSession.setAttribute("subscribe", "false");
            
            // title - the title passed from one web page to the other
            String sTitle = (String)hSession.getAttribute("title");
             
            String sSource = (String)hSession.getAttribute("source_name");
            // set the title of this web page depending on the task the user is doing  
            // @@@@@@@@@@@@@@ DELETE THIS BEGINING I set the title just after the CSS link 
            /*
            if (sSource.equalsIgnoreCase("Add Book")) {
                out.print("<title>Add Book</title>"); 
            } else if (sSource.equalsIgnoreCase("Show Book")) {
                out.print("<title>Show Book</title>");
            } else if (sSource.equalsIgnoreCase("Search")) {
                out.print("<title>Search</title>"); 
            } else if (sSource.equalsIgnoreCase("Update Book")) {
                out.print("<title>Update Book</title>"); 
            } else if (sSource.equalsIgnoreCase("Login")){
                out.print("<title>Login</title>");
            }
            */
            // @@@@@@@@@@@@@@ DELETE THIS END
        
      out.write("    \n");
      out.write("        \n");
      out.write("        <!-- link to the external stylesheet -->\n");
      out.write("        <link href=\"css/templatecss.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("        <title>Lesen - ");
      out.print( sTitle );
      out.write("</title>\n");
      out.write("        <!-- internal CSS stylesheet -->\n");
      out.write("        <style>\n");
      out.write("            .red_text {\n");
      out.write("                color: red; /* red text color */\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("        <!-- including the file header.jsp into this file -->\n");
      out.write("        <!-- header.jsp contains - company logo, company name and the navigation bar -->\n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- author: Ingrid Farkas -->\n");
      out.write("<!-- header.jsp creates - company logo, company name and the navigation bar -->\n");
      out.write("\n");
      out.write("\n");
  final String URL_EMP_ADM = "Lesen/Mitarbeiter"; // the URL for employees and administrators
    final String URL_CUST = "Lesen"; // the URL for customers

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>           \n");
      out.write("        <!-- meta elements -->\n");
      out.write("        <!-- character set used on the web page -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <!-- specifying the keywords used for Internet search --> \n");
      out.write("        <meta name=\"keywords\" content=\"Lesen, Bookstore in London, Online Bookstore\">\n");
      out.write("        <!-- meta tag used for specifying the description and the purpose of the web site -->\n");
      out.write("        <meta name=\"description\" content=\"Browse and Shop From the Wide Selection of Books\">\n");
      out.write("        <meta name=\"author\" content=\"Ingrid Farkas\"> \n");
      out.write("        <!-- used for making responsive web pages on devices with different screen sizes -->\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\"> \n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\">\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("        \n");
      out.write("        <!-- a link to the Bootstrap CDN -->\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"></script> \n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"></script> \n");
      out.write("        <link rel=\"stylesheet\" href=\"css/templatecss.css\">\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            // setCookie: creates 2 cookies \n");
      out.write("            // 1. cookie : fill_in = false \n");
      out.write("            // 2. cookie : webpg_name = webPageVal\n");
      out.write("            function cookieFillIn( webPageVal ) {                \n");
      out.write("                document.cookie = \"fill_in=false;\"; // creating a cookie\n");
      out.write("                document.cookie = \"webpg_name=\" + webPageVal;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body class=\"greybckgr\"> <!-- greybckgr - class which defines grey background (templatecss.css) -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"whitebckgr\"> <!-- new row - white background -->\n");
      out.write("            <div class=\"whitebckgr\"> \n");
      out.write("                <!-- the Bootstrap column takes 12 columns on the large screens, 12 columns on the medium sized screens,\n");
      out.write("                     12 columns on the small sized screens, 12 columns on the extra small screens -->\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                    <p>&nbsp; &nbsp;</p> <!-- adding some empty space -->\n");
      out.write("                </div>\n");
      out.write("              \n");
      out.write("                <div class=\"row\"> <!-- adding a new row to the grid -->\n");
      out.write("                    <!-- the Bootstrap column takes 5 columns on the large screens, 5 columns on the medium sized screens -->\n");
      out.write("                    <div class=\"col-lg-5 col-md-5\"> \n");
      out.write("                        &nbsp; &nbsp; <!-- adding some empty space -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- the Bootstrap column takes 4 columns on the large screens, 4 columns on the medium sized screens -->\n");
      out.write("                    <div class=\"col-lg-4 col-md-4\"> \n");
      out.write("                        &nbsp;  \n");
      out.write("                        <!-- image that is the logo of the Lesen; alt - the text that is shown if the image can't be loaded (alternate text)\n");
      out.write("                             title - the text that is shown when the user points at the image -->\n");
      out.write("                        <img class=\"img-logo\" src=\"images/bookshelf.png\" alt=\"Lesen Logo\" title=\"Lesen Logo\">  \n");
      out.write("                                    \n");
      out.write("                        <span class=\"title-text\">Lesen</span> <!-- the title of the bookstore -->\n");
      out.write("                    </div>\n");
      out.write("                    \n");
      out.write("                    <!-- the Bootstrap column takes 7 columns on the large screens, 7 columns on the medium sized screens,\n");
      out.write("                         12 columns on the small screens, 12 columns on the extra small sized screens -->\n");
      out.write("                    <div class=\"col-lg-7 col-md-7 col-sm-12 col-xs-12 \"> \n");
      out.write("                        &nbsp; &nbsp; <!-- adding some empty space -->\n");
      out.write("                    </div>\n");
      out.write("                </div> \n");
      out.write("            </div>          \n");
      out.write("\n");
      out.write("            <div class=\"whitebckgr\"> <!-- new row - white background -->\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    &nbsp; &nbsp; <!-- adding some empty space -->\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            ");

                String emp_adm = ""; // is the user using the website for employees and administrators (and not for customers) 
                String logged_in = ""; // is the user logged in
                String userType = ""; // type of the user: admin, emp, customer (the possible values)
                String attrName = ""; // variable name in the session
                boolean attr_found = false; // is the emp_adm one of variables in the session
                
                HttpSession hSession1 = LesenMethoden.returnSession(request);
                
                // sessVarExists: returns whether the session var. user_type exists in the session
                // user_type: admin, emp, customer (the possible values) (exists after the user tried to log in)
                attr_found = LesenMethoden.sessVarExists(hSession1, "user_type"); 
                if (attr_found) // if the attribute named user_type was found
                    userType = String.valueOf(hSession1.getAttribute("user_type")); // admin, emp, customer (the possible values)
                
                String URL_String = (request.getRequestURL()).toString(); // the URL of the website loaded before this one
                
                // is the user using using the website for employees and administrators (and not for customers) 
                attr_found = LesenMethoden.sessVarExists(hSession1, "emp_adm"); // sessVarExists: returns whether the session var. emp_adm exists in the session
                if (attr_found) // if the attribute named emp_adm was found
                    emp_adm = String.valueOf(hSession1.getAttribute("emp_adm")); // read the value of  the attribute
                
                if (emp_adm.equals("")) { // if the attribute named emp_adm was not found
                    if (URL_String.contains(URL_EMP_ADM)) { // if the user is using the website for employees or administrators
                        emp_adm = "true";
                        hSession1.setAttribute("emp_adm1", emp_adm); // add the attribute to the session (value : true)                        
                    } else if (URL_String.contains(URL_CUST)) { // if the user is using the website for customers 
                        emp_adm = "false";
                        hSession1.setAttribute("emp_adm", emp_adm); // add the attribute to the session ( value : false )
                    }
                }
                
                // sessVarExists: returns whether the session var. logged_in exists in the session
                // logged_in is TRUE if the user is logged in (as employee or as administrator) 
                attr_found = LesenMethoden.sessVarExists(hSession1, "logged_in"); 
                if (attr_found) // if the attribute named logged_in was found
                    logged_in = String.valueOf(hSession1.getAttribute("logged_in")); // read the value of  the attribute
            
      out.write("\n");
      out.write("            \n");
      out.write("            <div class=\"row\">\n");
      out.write("            <!-- the Bootstrap column takes 12 columns on the large screens, 12 columns on the medium sized screens,\n");
      out.write("                12 columns on the small screens, 12 columns on the extra small sized screens -->\n");
      out.write("                <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\"> \n");
      out.write("                    <!-- navigation bar -->\n");
      out.write("                    <!-- navbar-expand-md : the navbar collapses at medium breakpoint -->\n");
      out.write("                    <nav class=\"navbar navbar-expand-md navbar-light bg-light\">\n");
      out.write("                        <a class=\"navbar-brand\"><img src=\"images/bookshelf.png\"></a> <!-- company logo -->\n");
      out.write("                        <a class=\"navbar-brand\" href=\"AddSessVar\" onclick = \"cookieFillIn('index.jsp')\">Lesen</a> <!-- name of the company -->\n");
      out.write("                        <!-- the toggler icon used to toggle the navigation -->\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-    \n");
      out.write("                            expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                            <!-- mr-auto : this part of the links on the navabar is on the LEFT hand side -->\n");
      out.write("                            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                                <!-- Home link on the navbar -->\n");
      out.write("                                <li class=\"nav-item\">   \n");
      out.write("                                    <a class=\"nav-link\" href=\"AddSessVar\" onclick=\"cookieFillIn('index.jsp')\">Home<span class=\"sr-only\">(current)</span></a> \n");
      out.write("                                </li>\n");
      out.write("                                ");

                                    if ((!(userType.equals("admin"))) && (!(userType.equals("emp")))) {
                                
      out.write("\n");
      out.write("                                        <!-- Search link on the navbar -->\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"AddSessVar\" onclick=\"cookieFillIn('search_page.jsp')\">Search</a>\n");
      out.write("                                        </li>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                                \n");
      out.write("                                ");

                                    if ((userType.equals("admin")) || (userType.equals("emp"))) {
                                
      out.write("\n");
      out.write("                                        <!-- Books link on the navbar -->\n");
      out.write("                                        <li class=\"nav-item dropdown\">\n");
      out.write("                                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                                Books\n");
      out.write("                                            </a>\n");
      out.write("                                            <!-- the dropdown submenu -->\n");
      out.write("                                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                                <a class=\"dropdown-item\" href=\"AddSessVar\" onclick=\"cookieFillIn('search_page.jsp')\">Search Book</a> <!-- Search Book link on the submenu --> \n");
      out.write("                                                <div class=\"dropdown-divider\"></div> <!-- the divider on the drop down menu -->\n");
      out.write("                                                <a class=\"dropdown-item\" href=\"AddSessVar\" onclick=\"cookieFillIn('add_page.jsp')\">Add Book</a> <!-- Add Book link on the submenu --> \n");
      out.write("                                                <a class=\"dropdown-item\" href=\"AddSessVar\" onclick=\"cookieFillIn('update_prev.jsp')\">Update Book</a> <!-- Update Book link on the submenu --> \n");
      out.write("                                                <a class=\"dropdown-item\" href=\"AddSessVar\" onclick=\"cookieFillIn('delete_title.jsp')\">Delete Book</a> <!-- Delete Book link on the submenu --> \n");
      out.write("                                            </div>\n");
      out.write("                                        </li>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                                <!-- About link on the navbar -->\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"AddSessVar\" onclick=\"cookieFillIn('about_page.jsp')\">About</a>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- Contact link on the navbar -->\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"AddSessVar\" onclick=\"cookieFillIn('contact_page.jsp')\">Contact</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                                                            \n");
      out.write("                            <!-- ml-auto : this part of the links on the navabar is on the RIGHT hand side -->\n");
      out.write("                            <ul class=\"navbar-nav ml-auto\">\n");
      out.write("                                ");

                                    if (userType.equals("admin")) {
                                
      out.write("    \n");
      out.write("                                        <!-- Sign Up link on the navbar -->\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"AddSessVar\" onclick=\"cookieFillIn('SignUp')\">Sign Up</a>\n");
      out.write("                                        </li>\n");
      out.write("                                ");
 
                                    }
                                
      out.write("\n");
      out.write("                                \n");
      out.write("                                ");

                                    // if the user is logged in show the Log Out link
                                    if (logged_in.equals("true")) {
                                
      out.write("    \n");
      out.write("                                        <!-- Login link on the navbar -->\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"LogOutServlet\">Ausmelden</a>\n");
      out.write("                                        </li>                               \n");
      out.write("                                ");

                                    // if the user is logged in as administrator("admin") or employee("emp") or the user accessed the website for 
                                    // employees or administrators
                                    } else if ((userType.equals("admin")) || (userType.equals("emp")) || (emp_adm.equals("true"))) {
                                
      out.write("    \n");
      out.write("                                        <!-- Login link on the navbar -->\n");
      out.write("                                        <li class=\"nav-item\">\n");
      out.write("                                            <a class=\"nav-link\" href=\"AddSessVar\" onclick=\"cookieFillIn('login_inf_page.jsp')\">Anmelden</a>\n");
      out.write("                                        </li>\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div> <!-- class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12 -->\n");
      out.write("            </div> <!-- end of class=\"row\" --> \n");
      out.write("        \n");
      out.write("            <div class=\"whitebckgr\">\n");
      out.write("                <div class=\"col-lg-12 col-md-12\">\n");
      out.write("                    &nbsp; &nbsp; <!-- adding some empty space -->\n");
      out.write("                </div>\n");
      out.write("            </div>");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"whitebckgr\">\n");
      out.write("            <div class=\"row\"> <!-- adding a new row to the Bootstrap grid -->\n");
      out.write("                <!-- the Bootstrap column takes 6 columns on the large desktops and 6 columns on the medium sized desktops -->\n");
      out.write("                <div class=\"col-lg-6 col-md-6\"> \n");
      out.write("                    <br /><br />\n");
      out.write("                    <div> \n");
      out.write("                        <!-- horizontally centering the picture using center-image, img-fluid is for responsive image -->\n");
      out.write("                        <img src=\"images/books.png\" class=\"img-fluid center-image\" alt=\"picture of books\" title=\"picture of books\"> \n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                \n");
      out.write("                <!-- the Bootstrap column takes 5 columns on the large screens and 5 columns on the medium sized screens -->\n");
      out.write("                <div class=\"col-lg-5 col-md-5\"> \n");
      out.write("                    <div class=\"container\">\n");
      out.write("                        <div class=\"row\"> <!-- adding a new row to the Bootstrap grid -->\n");
      out.write("                            <div class=\"col\">\n");
      out.write("                                &nbsp; &nbsp;\n");
      out.write("                                <br />\n");
      out.write("                                <br /><br /><br />\n");
      out.write("                                ");

                                    // title, source_name, message - the information passed from the other JSP (searchDB.jsp or updateDB.jsp)
                                    // sSource - the text shown on the button and for setting the action in the form tag
                                    
                                    // message - attribute passed from the other web page used to determine the message on the web page
                                    String sMessage = (String)hSession.getAttribute("message");
                                    
                                    // changing the color of error messages to red
                                    String errStart = "<span class=\"red_text\">";
                                    String errEnd = "</span>";
                                    
                                    out.print("<br />");
                                    out.print("<h3 class=\"text-info\">" + sTitle + "</h3><br /><br />");
                                    if (sMessage.equalsIgnoreCase("ERR_DB")) {
                                        out.print(errStart + "An error occurred" + errEnd + " while accessing the database!"); 
                                    } else if (sMessage.equalsIgnoreCase("ERR_LOGIN")) {   
                                        out.print("Der angegebene Benutzername oder das angegebene Passwort " + errStart + "ist falsch!" + errEnd );
                                    } else if (sMessage.equalsIgnoreCase("ERR_USER_EXISTS")) {
                                        out.print("Dieser Benutzername wurde bereits" + errStart + " von einem anderen Benutzer verwendet" + errEnd + ". Bitte nutzen Sie einen anderen Benutzername!");
                                    } else if (sMessage.equalsIgnoreCase("ERR_SIGN_UP")) {
                                        out.print("Während Ihrer Anfrage ist" + errStart + " ein Fehler aufgetreten " + errEnd + "und das Benutzerkonto wurde nicht in die Datenbank eingetragen!"); 
                                    } else if (sMessage.equalsIgnoreCase("ERR_SEARCH")) {
                                        out.print(errStart + "An error occurred" + errEnd + " during the search!"); 
                                    } else if (sMessage.equalsIgnoreCase("ERR_NO_BOOKID")) {
                                        out.print("The book with that title, author and isbn " + errStart + "doesn't exist!" + errEnd); 
                                    } else if (sMessage.equalsIgnoreCase("ERR_NO_AUTHID")) {
                                        out.print("The book from that author " + errStart + "doesn't exist!" + errEnd); 
                                    } else if (sMessage.equalsIgnoreCase("ERR_ADD")) {
                                        out.print(errStart + "An error occurred" + errEnd + " while adding the book to the database and the book wasn't successfully added to the database!"); 
                                    } else if (sMessage.equalsIgnoreCase("ERR_UPDATE")) {
                                        out.print("Bei der Speicherung die Seiteninformationen ist " + errStart + "ein Fehler aufgetreten!" + errEnd ); 
                                    } else if (sMessage.equalsIgnoreCase("ERR_DELETE")) {
                                        out.print("Bei der Löschung des Buches" + errStart + " ist ein Fehler aufgetreten!" + errEnd);
                                    } else if (sMessage.equalsIgnoreCase("DEL_NO_BOOK")) {
                                        out.print("Das Buch befindet sich nicht in der Datenbank " + errStart + "und es konnte nicht gelöscht werden!" + errEnd);
                                    } else if (sMessage.equalsIgnoreCase("ERR_ADD_EXISTS")) {
                                        out.print("Das Buch mit dieser ISBN befindet sich bereits in der Datenbank" + errStart + " und deswegen konnte nicht in der Datenbank eingetragen werden!" + errEnd);  
                                    } else if (sMessage.equalsIgnoreCase("SUCC_ADD")) {
                                        out.print("The book was successfully added to the database!");       
                                    } else if (sMessage.equalsIgnoreCase("SUCC_UPDATE")) {
                                        out.print("Die eingegebene Informationen wurden erfolgreich verändert!");  
                                    } else if (sMessage.equalsIgnoreCase("SUCC_DELETE")) {
                                        out.print("The book was successfully deleted from the database - Das Buch wurde erfolgreich gelöscht!");  
                                    } else if (sMessage.equalsIgnoreCase("SUCC_SIGN_UP")) {
                                        out.print("Der neue Benutzer wurde erfolgreich registriert. Vielen Dank für Ihre Registrierung!"); 
                                    } else if (sMessage.equalsIgnoreCase("SUCC_LOGOUT")) {
                                        out.print("You logged out successfully!");
                                    }
                                    
                                    // sSource used for setting the action attribute of the form tag (the page that is loaded when the user clicks the button)
                                    if (sSource.equalsIgnoreCase("Add Book")) {
                                
      out.write("\n");
      out.write("                                        <form action=\"add_page.jsp\" method=\"post\">\n");
      out.write("                                ");

                                    } else if (sSource.equalsIgnoreCase("Search")) {
                                
      out.write("\n");
      out.write("                                        <form action=\"search_page.jsp\" method=\"post\">  \n");
      out.write("                                ");

                                    } else if (sSource.equalsIgnoreCase("Buch Ändern")) {                            
                                
      out.write("\n");
      out.write("                                        <form action=\"update_prev.jsp\" method=\"post\"> \n");
      out.write("                                ");

                                    } else if (sSource.equalsIgnoreCase("Buch Löschen")) { 
                                
      out.write("\n");
      out.write("                                        <form action=\"delete_title.jsp\" method=\"post\">\n");
      out.write("                                ");

                                    } else if (sSource.equalsIgnoreCase("Login")) {
                                
      out.write("\n");
      out.write("                                        <form action=\"login_page.jsp\" method=\"post\">\n");
      out.write("                                ");

                                    } else if (sSource.equalsIgnoreCase("Log Out")) {
                                
      out.write("\n");
      out.write("                                        <form action=\"index.jsp\" method=\"post\">\n");
      out.write("                                ");

                                    } else if (sSource.equalsIgnoreCase("Sign Up")) {
                                
      out.write("\n");
      out.write("                                        <form action=\"SignUp\" method=\"post\">\n");
      out.write("                                ");

                                    }
                                
      out.write("\n");
      out.write("                                ");
 if (sSource.equals("Log Out")) {
                                       sSource = "Home"; // show on the button text Home
                                   }
                                
      out.write("\n");
      out.write("                                    <br /><br /><br />\n");
      out.write("                                    <!-- adding the To button to the form; btn-sm is used for smaller (narrower) size of the control -->\n");
      out.write("                                    <button type=\"submit\" class=\"btn btn-info btn-sm\"> ");
      out.print( sTitle );
      out.write("</button>\n");
      out.write("                                </form>\n");
      out.write("                                \n");
      out.write("                            </div> <!-- end of class = \"col\" -->\n");
      out.write("                        </div> <!-- end of class = \"row\" --> \n");
      out.write("                    </div> <!-- end of class = \"container\" -->\n");
      out.write("                </div> <!-- end of class = \"col-lg-5 col-md-5\" -->\n");
      out.write("            </div> <!-- end of class = \"row\" -->\n");
      out.write("        </div> <!-- end of class = \"whitebckgr\" -->\n");
      out.write("            \n");
      out.write("        <!-- adding a new row to the Bootstrap grid; class whitebckgr is for setting the background to white -->\n");
      out.write("        <div class=\"whitebckgr\">\n");
      out.write("            <div class=\"col\">\n");
      out.write("                &nbsp; &nbsp;\n");
      out.write("            </div>\n");
      out.write("        </div> \n");
      out.write("        <!-- including the file footer.jsp into this file -->\n");
      out.write("        <!-- footer.jsp contains the footer of the web page --> \n");
      out.write("        ");
      out.write("\n");
      out.write("\n");
      out.write("<!-- footer.jsp builds the footer of the web page --> \n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            \n");
      out.write("            // isEmail: returns true if the email address is valid (otherwise it returns false)\n");
      out.write("            function isEmail(email) {\n");
      out.write("                // regex pattern is used for validating email \n");
      out.write("                var regex = /^([a-zA-Z0-9_\\.\\-\\+])+\\@(([a-zA-Z0-9\\-])+\\.)+([a-zA-Z0-9]{2,4})+$/;\n");
      out.write("                if(!regex.test(email)) {\n");
      out.write("                    return false;\n");
      out.write("                } else {\n");
      out.write("                    return true;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            // createCookie: creates a cookie named valid_email with value that was entered as an email \n");
      out.write("            function createCookie() {\n");
      out.write("                var email = document.getElementById(\"subscr_email\").value;\n");
      out.write("                var cookie_str = \"valid_email=\";\n");
      out.write("                // if the email is valid the value is true\n");
      out.write("                if (isEmail(email)) {\n");
      out.write("                   cookie_str += \"true;\";\n");
      out.write("                } else {\n");
      out.write("                    cookie_str += \"false;\"; \n");
      out.write("                }\n");
      out.write("                document.cookie = cookie_str; // creating a cookie named valid_email\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body> \n");
      out.write("        <footer>\n");
      out.write("            <!-- footer is a class (in templatecss.css) defining the style of this div element -->\n");
      out.write("            <div class=\"footer\" align=\"center\" id=\"footer\">\n");
      out.write("                <div class=\"container\"> \n");
      out.write("                    <div class=\"row\"> \n");
      out.write("                        <!-- the Bootstrap column takes 2 columns on the large screen, 2 columns on the medium sized screens,\n");
      out.write("                             4 columns on the small sized screens, 6 columns on the extra small screens -->\n");
      out.write("                        <div  class=\"col-lg-2  col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("                            &nbsp; &nbsp; <!-- adding some empty space -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- the Bootstrap column takes 2 columns on the large screen, 2 columns on the medium sized screens,\n");
      out.write("                             4 columns on the small sized screens, 6 columns on the extra small screens -->\n");
      out.write("                        <div class=\"col-lg-2  col-md-2 col-sm-4 col-xs-6\">\n");
      out.write("                            <h3> About </h3> <!-- title of the column -->\n");
      out.write("                            <!-- smaller-text is a class used to declare the size of the text -->\n");
      out.write("                            <ul class=\"smaller-text\" >\n");
      out.write("                                <li> <a href=\"#\"> Our Company </a> </li> <!-- link that appears in the footer -->\n");
      out.write("                                <li> <a href=\"AddSessVar\" onclick = \"cookieFillIn('about_page.jsp')\"> About Us </a> </li>\n");
      out.write("                                <li> <a href=\"#\"> Terms of Services </a> </li>\n");
      out.write("                                <li> <a href=\"#\"> Our Team </a> </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("                        <!-- the Bootstrap column takes 2 columns on the large screen, 2 columns on the medium sized screens -->\n");
      out.write("                        <div class=\"col-lg-2  col-md-2\"> \n");
      out.write("                            &nbsp; &nbsp; <!-- adding some empty space -->\n");
      out.write("                        </div>\n");
      out.write("    \n");
      out.write("                        <!-- the Bootstrap column takes 1 column on the large screens, 1 columns on the medium sized screens -->\n");
      out.write("                        <div class=\"col-lg-1  col-md-1\"> \n");
      out.write("                            &nbsp; &nbsp; \n");
      out.write("                        </div>\n");
      out.write("    \n");
      out.write("                        <!-- the Bootstrap column takes 3 column on the large screens, 3 columns on the medium sized screens -->\n");
      out.write("                        <div class=\"col-lg-3  col-md-3\"> \n");
      out.write("                            <h3> Newsletter </h3> <!-- title of the column -->\n");
      out.write("                            <ul>\n");
      out.write("                                <li> \n");
      out.write("                                    <div class=\"container\"> \n");
      out.write("                                        <!-- after clicking on the button the SubscrServl servlet is called -->\n");
      out.write("                                        <form action=\"SubscrServl\" method=\"post\"> \n");
      out.write("                                            <div class=\"row\"> <!-- adding a new row the grid -->\n");
      out.write("                                                <div class=\"col\">\n");
      out.write("                                                    <!-- input element used for entering the email; form-control-sm is used for smaller size of the input element -->\n");
      out.write("                                                    <input class=\"form-control form-control-sm\" name=\"subscr_email\" id=\"subscr_email\" maxlength=\"35\" id=\"subscr_email\" type=\"text\" placeholder=\"Email\" required>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"row\"> <!- adding a new row the grid ->\n");
      out.write("                                                <div class=\"col\">\n");
      out.write("                                                    &nbsp; &nbsp;\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            \n");
      out.write("                                            <div class=\"row\"> <!-- adding a new row the grid -->\n");
      out.write("                                                <div class=\"col\">\n");
      out.write("                                                    <!-- adding the button Subscribe, btn-info is used for defining the color of the button,\n");
      out.write("                                                        form-control-sm is used for smaller size of the button -->\n");
      out.write("                                                        <button type=\"submit\" class=\"btn btn-info btn-sm\" id=\"btnSubscr\" onclick=\"createCookie()\">Abonnieren</button>\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                        </form>\n");
      out.write("                                    </div> <!-- end of class=\"container\" -->\n");
      out.write("                                </li>\n");
      out.write("                            </ul> \n");
      out.write("                        </div> <!-- end of class=\"col-lg-3  col-md-3\" -->\n");
      out.write("                    </div> <!-- end of class=\"row\" -->\n");
      out.write("                    \n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!-- the Bootstrap column takes 12 columns on the large screens, 12 columns on the medium sized screens -->\n");
      out.write("                        <div class=\"col-lg-12 col-md-12\">\n");
      out.write("                            &nbsp; &nbsp; <!-- adding some empty space -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> <!-- end of class=\"container\" -->\n");
      out.write("            </div> <!-- end of class=\"footer\" --> \n");
      out.write("                    \n");
      out.write("            <div class=\"footer\"> <!-- this is the bottom part of the footer -->\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <!-- the Bootstrap column takes 12 columns on the large screens, 12 columns on the medium sized screens, \n");
      out.write("                             12 columns on the extra small sized screens  -->\n");
      out.write("                        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                            &nbsp; &nbsp; <!-- adding some empty space -->\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"container text-center\">\n");
      out.write("                        <!-- the Bootstrap column takes 12 columns on the large screens, 12 columns on the medium sized screens, \n");
      out.write("                             12 columns on the extra small sized screens  -->\n");
      out.write("                        <div class=\"col-lg-12 col-md-12 col-sm-12 col-xs-12\">\n");
      out.write("                            <!-- adding the copyright information at the bottom of the footer -->\n");
      out.write("                            <div class=\"copyright smaller-text\"> Copyright &copy; 2018 Lesen. All rights reserved. 94 Grosvenor Ave., London SW1 5RD</div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div> <!-- end of the class=\"container\" -->\n");
      out.write("            </div> <!-- end of class=\"footer\" -->\n");
      out.write("        </footer> \n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write(" \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
