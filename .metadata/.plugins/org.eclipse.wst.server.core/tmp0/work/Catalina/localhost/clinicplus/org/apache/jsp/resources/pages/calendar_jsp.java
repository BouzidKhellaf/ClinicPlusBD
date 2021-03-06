/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.53
 * Generated at: 2014-05-05 19:53:53 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.resources.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class calendar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>AdminLTE | Calendar</title>\n");
      out.write("        <meta content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no' name='viewport'>\n");
      out.write("        <!-- bootstrap 3.0.2 -->\n");
      out.write("        <link href=\"../css/bootstrap.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- font Awesome -->\n");
      out.write("        <link href=\"../css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- Ionicons -->\n");
      out.write("        <link href=\"../css/ionicons.min.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <!-- fullCalendar -->\n");
      out.write("        <link href=\"../css/fullcalendar/fullcalendar.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        <link href=\"../css/fullcalendar/fullcalendar.print.css\" rel=\"stylesheet\" type=\"text/css\" media='print' />\n");
      out.write("        <!-- Theme style -->\n");
      out.write("        <link href=\"../css/AdminLTE.css\" rel=\"stylesheet\" type=\"text/css\" />\n");
      out.write("        \n");
      out.write("        <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->\n");
      out.write("        <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->\n");
      out.write("        <!--[if lt IE 9]>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js\"></script>\n");
      out.write("          <script src=\"https://oss.maxcdn.com/libs/respond.js/1.3.0/respond.min.js\"></script>\n");
      out.write("        <![endif]-->\n");
      out.write("    </head>\n");
      out.write("    <body class=\"skin-black\">\n");
      out.write("        <!-- header logo: style can be found in header.less -->\n");
      out.write("        <header class=\"header\">\n");
      out.write("            <a href=\"index.jsp\" class=\"logo\">\n");
      out.write("                <!-- Add the class icon to your logo image or logo icon to add the margining -->\n");
      out.write("                ClinicPlus\n");
      out.write("            </a>\n");
      out.write("            <!-- Header Navbar: style can be found in header.less -->\n");
      out.write("            <nav class=\"navbar navbar-static-top\" role=\"navigation\">\n");
      out.write("                <!-- Sidebar toggle button-->\n");
      out.write("                <a href=\"#\" class=\"navbar-btn sidebar-toggle\" data-toggle=\"offcanvas\" role=\"button\">\n");
      out.write("                    <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                    <span class=\"icon-bar\"></span>\n");
      out.write("                </a>\n");
      out.write("                <div class=\"navbar-right\">\n");
      out.write("                    <ul class=\"nav navbar-nav\">\n");
      out.write("                        \n");
      out.write("                        <!-- User Account: style can be found in dropdown.less -->\n");
      out.write("                        <li class=\"dropdown user user-menu\">\n");
      out.write("                            <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                                <i class=\"glyphicon glyphicon-user\"></i>\n");
      out.write("                                <span>Dr. Simon <i class=\"caret\"></i></span>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"dropdown-menu\">\n");
      out.write("                                <!-- User image -->\n");
      out.write("                                <li class=\"user-header bg-light-blue\">\n");
      out.write("                                    <img src=\"img/avatar/avatar_dr_simon.png\" class=\"img-circle\" alt=\"User Image\" />\n");
      out.write("                                    <p>\n");
      out.write("                                        Dr. Simon - Médecin\n");
      out.write("                                        <small>En poste depuis nov. 2012</small>\n");
      out.write("                                    </p>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- Menu Body -->\n");
      out.write("                                <li class=\"user-body\">\n");
      out.write("                                    <div class=\"col-xs-4 text-center\">\n");
      out.write("                                        <a href=\"#\">Horaire</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-xs-4 text-center\">\n");
      out.write("                                        <a href=\"#\">Dossiers</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <!-- Menu Footer-->\n");
      out.write("                                <li class=\"user-footer\">\n");
      out.write("                                    <div class=\"pull-left\">\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-default btn-flat\">Profile</a>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"pull-right\">\n");
      out.write("                                        <a href=\"#\" class=\"btn btn-default btn-flat\">Déconnection</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                    </ul>\n");
      out.write("                </div>\n");
      out.write("            </nav>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"wrapper row-offcanvas row-offcanvas-left\">\n");
      out.write("            <!-- Left side column. contains the logo and sidebar -->\n");
      out.write("            <aside class=\"left-side sidebar-offcanvas\">\n");
      out.write("                <!-- sidebar: style can be found in sidebar.less -->\n");
      out.write("                <section class=\"sidebar\">\n");
      out.write("                    <!-- Sidebar user panel -->\n");
      out.write("                    <div class=\"user-panel\">\n");
      out.write("                        <div class=\"pull-left image\">\n");
      out.write("                            <img src=\"img/avatar/avatar_dr_simon.png\" class=\"img-circle\" alt=\"User Image\" />\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"pull-left info\">\n");
      out.write("                            <p>Hello, Dr.Simon</p>\n");
      out.write("\n");
      out.write("                            <a href=\"#\"><i class=\"fa fa-circle text-success\"></i> Online</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- search form -->\n");
      out.write("                    <form action=\"#\" method=\"get\" class=\"sidebar-form\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" name=\"q\" class=\"form-control\" placeholder=\"Search...\"/>\n");
      out.write("                            <span class=\"input-group-btn\">\n");
      out.write("                                <button type='submit' name='seach' id='search-btn' class=\"btn btn-flat\"><i class=\"fa fa-search\"></i></button>\n");
      out.write("                            </span>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                    <!-- /.search form -->\n");
      out.write("                    <!-- sidebar menu: : style can be found in sidebar.less -->\n");
      out.write("                    <ul class=\"sidebar-menu\">\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                        <li class=\"treeview\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-edit\"></i> <span>Patient</span>\n");
      out.write("                                <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"treeview-menu\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> Liste</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> Rendez-vous</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> Dossiers</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li class=\"treeview\">\n");
      out.write("                            <a href=\"#\">\n");
      out.write("                                <i class=\"fa fa-table\"></i> <span>Enregistrer</span>\n");
      out.write("                                <i class=\"fa fa-angle-left pull-right\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <ul class=\"treeview-menu\">\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> Patient</a></li>\n");
      out.write("                                <li><a href=\"#\"><i class=\"fa fa-angle-double-right\"></i> Spécialiste</a></li>\n");
      out.write("                            </ul>\n");
      out.write("                        </li>\n");
      out.write("                        <li>\n");
      out.write("                            <a href=\"pages/calendar.html\">\n");
      out.write("                                <i class=\"fa fa-calendar\"></i> <span>Calendrier</span>\n");
      out.write("                                <small class=\"badge pull-right bg-red\">3</small>\n");
      out.write("                            </a>\n");
      out.write("                        </li>\n");
      out.write("                        \n");
      out.write("                        \n");
      out.write("                    </ul>\n");
      out.write("                </section>\n");
      out.write("                <!-- /.sidebar -->\n");
      out.write("            </aside>\n");
      out.write("            \n");
      out.write("                <aside class=\"right-side\">\n");
      out.write("                <!-- Main content -->\n");
      out.write("                <section class=\"content\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-3\">\n");
      out.write("                            <div class=\"box box-primary\">\n");
      out.write("                                <div class=\"box-header\">\n");
      out.write("                                    <h4 class=\"box-title\">Draggable Events</h4>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"box-body\">\n");
      out.write("                                    <!-- the events -->\n");
      out.write("                                    <div id='external-events'>                                        \n");
      out.write("                                        <div class='external-event bg-green'>Lunch</div>\n");
      out.write("                                        <div class='external-event bg-red'>Go home</div>\n");
      out.write("                                        <div class='external-event bg-aqua'>Do homework</div>\n");
      out.write("                                        <div class='external-event bg-yellow'>Work on UI design</div>\n");
      out.write("                                        <div class='external-event bg-navy'>Sleep tight</div>\n");
      out.write("                                        <p>\n");
      out.write("                                            <input type='checkbox' id='drop-remove' /> <label for='drop-remove'>remove after drop</label>\n");
      out.write("                                        </p>\n");
      out.write("                                    </div>\n");
      out.write("                                </div><!-- /.box-body -->\n");
      out.write("                            </div><!-- /. box -->\n");
      out.write("                            <div class=\"box box-primary\">\n");
      out.write("                                <div class=\"box-header\">\n");
      out.write("                                    <h3 class=\"box-title\">Create Event</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"box-body\">\n");
      out.write("                                    <div class=\"btn-group\" style=\"width: 100%; margin-bottom: 10px;\">\n");
      out.write("                                        <button type=\"button\" id=\"color-chooser-btn\" class=\"btn btn-danger btn-block btn-sm dropdown-toggle\" data-toggle=\"dropdown\">Color <span class=\"caret\"></span></button>\n");
      out.write("                                        <ul class=\"dropdown-menu\" id=\"color-chooser\">\n");
      out.write("                                            <li><a class=\"text-green\" href=\"#\"><i class=\"fa fa-square\"></i> Green</a></li>\n");
      out.write("                                            <li><a class=\"text-blue\" href=\"#\"><i class=\"fa fa-square\"></i> Blue</a></li>                                            \n");
      out.write("                                            <li><a class=\"text-navy\" href=\"#\"><i class=\"fa fa-square\"></i> Navy</a></li>                                            \n");
      out.write("                                            <li><a class=\"text-yellow\" href=\"#\"><i class=\"fa fa-square\"></i> Yellow</a></li>\n");
      out.write("                                            <li><a class=\"text-orange\" href=\"#\"><i class=\"fa fa-square\"></i> Orange</a></li>\n");
      out.write("                                            <li><a class=\"text-aqua\" href=\"#\"><i class=\"fa fa-square\"></i> Aqua</a></li>\n");
      out.write("                                            <li><a class=\"text-red\" href=\"#\"><i class=\"fa fa-square\"></i> Red</a></li>\n");
      out.write("                                            <li><a class=\"text-fuchsia\" href=\"#\"><i class=\"fa fa-square\"></i> Fuchsia</a></li>\n");
      out.write("                                            <li><a class=\"text-purple\" href=\"#\"><i class=\"fa fa-square\"></i> Purple</a></li>\n");
      out.write("                                        </ul>\n");
      out.write("                                    </div><!-- /btn-group -->\n");
      out.write("                                    <div class=\"input-group\">                                          \n");
      out.write("                                        <input id=\"new-event\" type=\"text\" class=\"form-control\" placeholder=\"Event Title\">\n");
      out.write("                                        <div class=\"input-group-btn\">\n");
      out.write("                                            <button id=\"add-new-event\" type=\"button\" class=\"btn btn-default btn-flat\">Add</button>\n");
      out.write("                                        </div><!-- /btn-group -->\n");
      out.write("                                    </div><!-- /input-group -->\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div><!-- /.col -->\n");
      out.write("                        <div class=\"col-md-9\">\n");
      out.write("                            <div class=\"box box-primary\">                                \n");
      out.write("                                <div class=\"box-body no-padding\">\n");
      out.write("                                    <!-- THE CALENDAR -->\n");
      out.write("                                    <div id=\"calendar\"></div>\n");
      out.write("                                </div><!-- /.box-body -->\n");
      out.write("                            </div><!-- /. box -->\n");
      out.write("                        </div><!-- /.col -->\n");
      out.write("                    </div><!-- /.row -->  \n");
      out.write("\n");
      out.write("\n");
      out.write("                </section><!-- /.content -->\n");
      out.write("            </aside><!-- /.right-side -->\n");
      out.write("        </div><!-- ./wrapper -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- jQuery 2.0.2 -->\n");
      out.write("        <script src=\"http://ajax.googleapis.com/ajax/libs/jquery/2.0.2/jquery.min.js\"></script>\n");
      out.write("        <!-- jQuery UI 1.10.3 -->\n");
      out.write("        <script src=\"../js/jquery-ui-1.10.3.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Bootstrap -->\n");
      out.write("        <script src=\"../js/bootstrap.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- AdminLTE App -->\n");
      out.write("        <script src=\"../js/AdminLTE/app.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- fullCalendar -->\n");
      out.write("        <script src=\"../js/plugins/fullcalendar/fullcalendar.min.js\" type=\"text/javascript\"></script>\n");
      out.write("        <!-- Page specific script -->\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(function() {\n");
      out.write("\n");
      out.write("                /* initialize the external events\n");
      out.write("                 -----------------------------------------------------------------*/\n");
      out.write("                function ini_events(ele) {\n");
      out.write("                    ele.each(function() {\n");
      out.write("\n");
      out.write("                        // create an Event Object (http://arshaw.com/fullcalendar/docs/event_data/Event_Object/)\n");
      out.write("                        // it doesn't need to have a start or end\n");
      out.write("                        var eventObject = {\n");
      out.write("                            title: $.trim($(this).text()) // use the element's text as the event title\n");
      out.write("                        };\n");
      out.write("\n");
      out.write("                        // store the Event Object in the DOM element so we can get to it later\n");
      out.write("                        $(this).data('eventObject', eventObject);\n");
      out.write("\n");
      out.write("                        // make the event draggable using jQuery UI\n");
      out.write("                        $(this).draggable({\n");
      out.write("                            zIndex: 1070,\n");
      out.write("                            revert: true, // will cause the event to go back to its\n");
      out.write("                            revertDuration: 0  //  original position after the drag\n");
      out.write("                        });\n");
      out.write("\n");
      out.write("                    });\n");
      out.write("                }\n");
      out.write("                ini_events($('#external-events div.external-event'));\n");
      out.write("\n");
      out.write("                /* initialize the calendar\n");
      out.write("                 -----------------------------------------------------------------*/\n");
      out.write("                //Date for the calendar events (dummy data)\n");
      out.write("                var date = new Date();\n");
      out.write("                var d = date.getDate(),\n");
      out.write("                        m = date.getMonth(),\n");
      out.write("                        y = date.getFullYear();\n");
      out.write("                $('#calendar').fullCalendar({\n");
      out.write("                    header: {\n");
      out.write("                        left: 'prev,next today',\n");
      out.write("                        center: 'title',\n");
      out.write("                        right: 'month,agendaWeek,agendaDay'\n");
      out.write("                    },\n");
      out.write("                    buttonText: {//This is to add icons to the visible buttons\n");
      out.write("                        prev: \"<span class='fa fa-caret-left'></span>\",\n");
      out.write("                        next: \"<span class='fa fa-caret-right'></span>\",\n");
      out.write("                        today: 'today',\n");
      out.write("                        month: 'month',\n");
      out.write("                        week: 'week',\n");
      out.write("                        day: 'day'\n");
      out.write("                    },\n");
      out.write("                    //Random default events\n");
      out.write("                    events: [\n");
      out.write("                        {\n");
      out.write("                            title: 'All Day Event',\n");
      out.write("                            start: new Date(y, m, 1),\n");
      out.write("                            backgroundColor: \"#f56954\", //red \n");
      out.write("                            borderColor: \"#f56954\" //red\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            title: 'Long Event',\n");
      out.write("                            start: new Date(y, m, d - 5),\n");
      out.write("                            end: new Date(y, m, d - 2),\n");
      out.write("                            backgroundColor: \"#f39c12\", //yellow\n");
      out.write("                            borderColor: \"#f39c12\" //yellow\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            title: 'Meeting',\n");
      out.write("                            start: new Date(y, m, d, 10, 30),\n");
      out.write("                            allDay: false,\n");
      out.write("                            backgroundColor: \"#0073b7\", //Blue\n");
      out.write("                            borderColor: \"#0073b7\" //Blue\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            title: 'Lunch',\n");
      out.write("                            start: new Date(y, m, d, 12, 0),\n");
      out.write("                            end: new Date(y, m, d, 14, 0),\n");
      out.write("                            allDay: false,\n");
      out.write("                            backgroundColor: \"#00c0ef\", //Info (aqua)\n");
      out.write("                            borderColor: \"#00c0ef\" //Info (aqua)\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            title: 'Birthday Party',\n");
      out.write("                            start: new Date(y, m, d + 1, 19, 0),\n");
      out.write("                            end: new Date(y, m, d + 1, 22, 30),\n");
      out.write("                            allDay: false,\n");
      out.write("                            backgroundColor: \"#00a65a\", //Success (green)\n");
      out.write("                            borderColor: \"#00a65a\" //Success (green)\n");
      out.write("                        },\n");
      out.write("                        {\n");
      out.write("                            title: 'Click for Google',\n");
      out.write("                            start: new Date(y, m, 28),\n");
      out.write("                            end: new Date(y, m, 29),\n");
      out.write("                            url: 'http://google.com/',\n");
      out.write("                            backgroundColor: \"#3c8dbc\", //Primary (light-blue)\n");
      out.write("                            borderColor: \"#3c8dbc\" //Primary (light-blue)\n");
      out.write("                        }\n");
      out.write("                    ],\n");
      out.write("                    editable: true,\n");
      out.write("                    droppable: true, // this allows things to be dropped onto the calendar !!!\n");
      out.write("                    drop: function(date, allDay) { // this function is called when something is dropped\n");
      out.write("\n");
      out.write("                        // retrieve the dropped element's stored Event Object\n");
      out.write("                        var originalEventObject = $(this).data('eventObject');\n");
      out.write("\n");
      out.write("                        // we need to copy it, so that multiple events don't have a reference to the same object\n");
      out.write("                        var copiedEventObject = $.extend({}, originalEventObject);\n");
      out.write("\n");
      out.write("                        // assign it the date that was reported\n");
      out.write("                        copiedEventObject.start = date;\n");
      out.write("                        copiedEventObject.allDay = allDay;\n");
      out.write("                        copiedEventObject.backgroundColor = $(this).css(\"background-color\");\n");
      out.write("                        copiedEventObject.borderColor = $(this).css(\"border-color\");\n");
      out.write("\n");
      out.write("                        // render the event on the calendar\n");
      out.write("                        // the last `true` argument determines if the event \"sticks\" (http://arshaw.com/fullcalendar/docs/event_rendering/renderEvent/)\n");
      out.write("                        $('#calendar').fullCalendar('renderEvent', copiedEventObject, true);\n");
      out.write("\n");
      out.write("                        // is the \"remove after drop\" checkbox checked?\n");
      out.write("                        if ($('#drop-remove').is(':checked')) {\n");
      out.write("                            // if so, remove the element from the \"Draggable Events\" list\n");
      out.write("                            $(this).remove();\n");
      out.write("                        }\n");
      out.write("\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("\n");
      out.write("                /* ADDING EVENTS */\n");
      out.write("                var currColor = \"#f56954\"; //Red by default\n");
      out.write("                //Color chooser button\n");
      out.write("                var colorChooser = $(\"#color-chooser-btn\");\n");
      out.write("                $(\"#color-chooser > li > a\").click(function(e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    //Save color\n");
      out.write("                    currColor = $(this).css(\"color\");\n");
      out.write("                    //Add color effect to button\n");
      out.write("                    colorChooser\n");
      out.write("                            .css({\"background-color\": currColor, \"border-color\": currColor})\n");
      out.write("                            .html($(this).text()+' <span class=\"caret\"></span>');\n");
      out.write("                });\n");
      out.write("                $(\"#add-new-event\").click(function(e) {\n");
      out.write("                    e.preventDefault();\n");
      out.write("                    //Get value and make sure it is not null\n");
      out.write("                    var val = $(\"#new-event\").val();\n");
      out.write("                    if (val.length == 0) {\n");
      out.write("                        return;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("                    //Create event\n");
      out.write("                    var event = $(\"<div />\");\n");
      out.write("                    event.css({\"background-color\": currColor, \"border-color\": currColor, \"color\": \"#fff\"}).addClass(\"external-event\");\n");
      out.write("                    event.html(val);\n");
      out.write("                    $('#external-events').prepend(event);\n");
      out.write("\n");
      out.write("                    //Add draggable funtionality\n");
      out.write("                    ini_events(event);\n");
      out.write("\n");
      out.write("                    //Remove event from text input\n");
      out.write("                    $(\"#new-event\").val(\"\");\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
