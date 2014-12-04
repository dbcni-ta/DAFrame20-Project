/*
 * JSP generated by Resin-4.0.28 (built Fri, 08 Jun 2012 05:08:34 PDT)
 */

package _jsp._base;
import javax.servlet.*;
import javax.servlet.jsp.*;
import javax.servlet.http.*;
import com.cni.fw.ff.dto.*;
import com.cni.fw.ff.dto.entity.*;
import com.cni.fw.ff.util.maker.*;
import com.cni.fw.ff.dto.support.*;
import com.cni.fw.ff.util.*;
import com.cni.fw.id.*;
import com.cni.fw.web.util.*;
import com.cni.fw.web.session.so.CommonSession;
import com.cni.fw.ff.util.finder.MtoMtoFinder;

public class _fw_0db_0util__jsp extends com.cni.fw.arch.ArchJsp implements com.caucho.jsp.CauchoPage
{
  private static final java.util.HashMap<String,java.lang.reflect.Method> _jsp_functionMap = new java.util.HashMap<String,java.lang.reflect.Method>();
  private boolean _caucho_isDead;
  private boolean _caucho_isNotModified;
  private com.caucho.jsp.PageManager _jsp_pageManager;
  
  public void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response)
    throws java.io.IOException, javax.servlet.ServletException
  {
    javax.servlet.http.HttpSession session = request.getSession(true);
    com.caucho.server.webapp.WebApp _jsp_application = _caucho_getApplication();
    com.caucho.jsp.PageContextImpl pageContext = _jsp_pageManager.allocatePageContext(this, _jsp_application, request, response, null, session, 8192, true, false);

    TagState _jsp_state = null;

    try {
      _jspService(request, response, pageContext, _jsp_application, session, _jsp_state);
    } catch (java.lang.Throwable _jsp_e) {
      pageContext.handlePageException(_jsp_e);
    } finally {
      _jsp_pageManager.freePageContext(pageContext);
    }
  }
  
  private void
  _jspService(javax.servlet.http.HttpServletRequest request,
              javax.servlet.http.HttpServletResponse response,
              com.caucho.jsp.PageContextImpl pageContext,
              javax.servlet.ServletContext application,
              javax.servlet.http.HttpSession session,
              TagState _jsp_state)
    throws Throwable
  {
    javax.servlet.jsp.JspWriter out = pageContext.getOut();
    final javax.el.ELContext _jsp_env = pageContext.getELContext();
    javax.servlet.ServletConfig config = getServletConfig();
    javax.servlet.Servlet page = this;
    javax.servlet.jsp.tagext.JspTag _jsp_parent_tag = null;
    com.caucho.jsp.PageContextImpl _jsp_parentContext = pageContext;
    response.setContentType("text/html; charset=UTF-8");

    out.write(_jsp_string0, 0, _jsp_string0.length);
    
    CauseDTO input = getCauseDTO(request);
    EffectDTO output = getEffectDTO(request);
    CommonSession cs = null;
    if (input != null) {
		cs = input.getCommonSession();
    }
    String ctxPath = request.getContextPath();

    out.write(_jsp_string1, 0, _jsp_string1.length);
    out.print(( request.getContextPath() ));
    out.write(_jsp_string2, 0, _jsp_string2.length);
    out.print(( request.getContextPath() ));
    out.write(_jsp_string3, 0, _jsp_string3.length);
    out.print(( request.getContextPath() ));
    out.write(_jsp_string4, 0, _jsp_string4.length);
    out.print(( request.getContextPath() ));
    out.write(_jsp_string5, 0, _jsp_string5.length);
    
	if (output != null) {
		if (output.getCode().equals("NO-DB")) {

    out.write(_jsp_string6, 0, _jsp_string6.length);
    out.print(( output.getMessage() ));
    out.write(_jsp_string7, 0, _jsp_string7.length);
    		
		return;
		}
	}
	
	MTO tblInfo = output.getMTO("tblInfo");

    out.write(_jsp_string8, 0, _jsp_string8.length);
    
	if ( tblInfo !=null) {

    out.write(_jsp_string9, 0, _jsp_string9.length);
    	
	}

    out.write(_jsp_string10, 0, _jsp_string10.length);
    out.print(( StringMaker.make(input.get("dbName")) ));
    out.write(_jsp_string11, 0, _jsp_string11.length);
    out.print(( StringMaker.make(input.get("tablePattern")) ));
    out.write(_jsp_string12, 0, _jsp_string12.length);
     
				LTO tblList = output.getLTO("tblList");
				if (tblList != null) {
					for (int i=0;i<tblList.size();i++) {
						String tblName = tblList.get(i).get("TABLE_NAME");
			
    out.write(_jsp_string13, 0, _jsp_string13.length);
     if (tblName.equals(input.get("tableTarget"))) {out.print("selected");} 
    out.write('>');
    out.print(( tblName ));
    out.write(_jsp_string14, 0, _jsp_string14.length);
      	
					} 
				} 
			
    out.write(_jsp_string15, 0, _jsp_string15.length);
    
	if ( tblInfo !=null) {

    out.write(_jsp_string16, 0, _jsp_string16.length);
    out.print(( request.getContextPath() ));
    out.write(_jsp_string17, 0, _jsp_string17.length);
    out.print(( input.get("tableTarget") ));
    out.write(_jsp_string18, 0, _jsp_string18.length);
    out.print(( StringMaker.make(input.get("dbName")) ));
    out.write(_jsp_string19, 0, _jsp_string19.length);
    out.print(( StringMaker.make(input.get("tableTarget")) ));
    out.write(_jsp_string20, 0, _jsp_string20.length);
    
	ATO sortedKey = MtoMtoFinder.sortKeyByInnerOrderKey(tblInfo,"ORDINAL_POSITION",1);
		
	for (int i=0;i<sortedKey.size();i++) {
		String key = sortedKey.get(i);
		MTO colInfo =(MTO) tblInfo.getObject(key);		

    out.write(_jsp_string21, 0, _jsp_string21.length);
    out.print(( colInfo.get("COLUMN_NAME") ));
    out.write(_jsp_string20, 0, _jsp_string20.length);
    
	}

    out.write(_jsp_string22, 0, _jsp_string22.length);
    out.print(( StringMaker.make(input.get("pgSize")) ));
    out.write(_jsp_string23, 0, _jsp_string23.length);
    out.print(( request.getContextPath() ));
    out.write(_jsp_string24, 0, _jsp_string24.length);
    out.print(( input.get("tableTarget") ));
    out.write(_jsp_string25, 0, _jsp_string25.length);
    
		
	for (int i=0;i<sortedKey.size();i++) {
		String key = sortedKey.get(i);
		MTO colInfo =(MTO) tblInfo.getObject(key);		

    out.write(_jsp_string26, 0, _jsp_string26.length);
    out.print(( colInfo.get("ORDINAL_POSITION") ));
    out.write(_jsp_string27, 0, _jsp_string27.length);
    out.print(( colInfo.get("COLUMN_NAME") ));
    out.write(_jsp_string28, 0, _jsp_string28.length);
    out.print(( colInfo.get("TYPE_NAME") ));
    out.write(_jsp_string28, 0, _jsp_string28.length);
    out.print(( colInfo.get("COLUMN_SIZE") ));
    out.write(_jsp_string28, 0, _jsp_string28.length);
    out.print(( StrUtil.nullToStr(colInfo.get("DECIMAL_DIGITS")) ));
    out.write(_jsp_string28, 0, _jsp_string28.length);
    out.print(( colInfo.get("IS_PK") ));
    out.write(_jsp_string28, 0, _jsp_string28.length);
    out.print(( colInfo.get("IS_NULLABLE") ));
    out.write(_jsp_string29, 0, _jsp_string29.length);
    out.print(( colInfo.get("COLUMN_NAME") ));
    out.write(_jsp_string30, 0, _jsp_string30.length);
    
	}

    out.write(_jsp_string31, 0, _jsp_string31.length);
    
	} else {

    out.write(_jsp_string32, 0, _jsp_string32.length);
    out.print(( request.getContextPath() ));
    out.write(_jsp_string33, 0, _jsp_string33.length);
    out.print(( StringMaker.make(input.get("dbName")) ));
    out.write(_jsp_string34, 0, _jsp_string34.length);
    out.print(( StringMaker.make(input.get("pgSize")) ));
    out.write(_jsp_string35, 0, _jsp_string35.length);
    out.print(( request.getContextPath() ));
    out.write(_jsp_string36, 0, _jsp_string36.length);
    
	} //<!--//window.document.tsqlGenForm.dbName.value-->

    out.write(_jsp_string37, 0, _jsp_string37.length);
  }

  private com.caucho.make.DependencyContainer _caucho_depends
    = new com.caucho.make.DependencyContainer();

  public java.util.ArrayList<com.caucho.vfs.Dependency> _caucho_getDependList()
  {
    return _caucho_depends.getDependencies();
  }

  public void _caucho_addDepend(com.caucho.vfs.PersistentDependency depend)
  {
    _caucho_depends.add(depend);
  }

  protected void _caucho_setNeverModified(boolean isNotModified)
  {
    _caucho_isNotModified = true;
  }

  public boolean _caucho_isModified()
  {
    if (_caucho_isDead)
      return true;

    if (_caucho_isNotModified)
      return false;

    if (com.caucho.server.util.CauchoSystem.getVersionId() != -2856366979881442457L)
      return true;

    return _caucho_depends.isModified();
  }

  public long _caucho_lastModified()
  {
    return 0;
  }

  public com.caucho.server.webapp.WebApp _caucho_getApplication()
  {
     return (com.caucho.server.webapp.WebApp) getServletConfig().getServletContext();
  }

  public void init(com.caucho.vfs.Path appDir)
    throws javax.servlet.ServletException
  {
    com.caucho.vfs.Path resinHome = com.caucho.server.util.CauchoSystem.getResinHome();
    com.caucho.vfs.MergePath mergePath = new com.caucho.vfs.MergePath();
    mergePath.addMergePath(appDir);
    mergePath.addMergePath(resinHome);
    com.caucho.loader.DynamicClassLoader loader;
    loader = (com.caucho.loader.DynamicClassLoader) getClass().getClassLoader();
    String resourcePath = loader.getResourcePathSpecificFirst();
    mergePath.addClassPath(resourcePath);
    com.caucho.vfs.Depend depend;
    depend = new com.caucho.vfs.Depend(appDir.lookup("base/fw_db_util.jsp"), -3652192232972265593L, false);
    _caucho_depends.add(depend);
    depend = new com.caucho.vfs.Depend(appDir.lookup("base/include/ArchJsp.jspf"), -4082645001948788182L, false);
    _caucho_depends.add(depend);
  }

  final static class TagState {

    void release()
    {
    }
  }

  public java.util.HashMap<String,java.lang.reflect.Method> _caucho_getFunctionMap()
  {
    return _jsp_functionMap;
  }

  public void caucho_init(ServletConfig config)
  {
    try {
      com.caucho.server.webapp.WebApp webApp
        = (com.caucho.server.webapp.WebApp) config.getServletContext();
      init(config);
      if (com.caucho.jsp.JspManager.getCheckInterval() >= 0)
        _caucho_depends.setCheckInterval(com.caucho.jsp.JspManager.getCheckInterval());
      _jsp_pageManager = webApp.getJspApplicationContext().getPageManager();
      com.caucho.jsp.TaglibManager manager = webApp.getJspApplicationContext().getTaglibManager();
      com.caucho.jsp.PageContextImpl pageContext = new com.caucho.jsp.InitPageContextImpl(webApp, this);
    } catch (Exception e) {
      throw com.caucho.config.ConfigException.create(e);
    }
  }

  private final static char []_jsp_string31;
  private final static char []_jsp_string27;
  private final static char []_jsp_string8;
  private final static char []_jsp_string15;
  private final static char []_jsp_string2;
  private final static char []_jsp_string20;
  private final static char []_jsp_string24;
  private final static char []_jsp_string36;
  private final static char []_jsp_string18;
  private final static char []_jsp_string14;
  private final static char []_jsp_string11;
  private final static char []_jsp_string25;
  private final static char []_jsp_string34;
  private final static char []_jsp_string1;
  private final static char []_jsp_string30;
  private final static char []_jsp_string33;
  private final static char []_jsp_string17;
  private final static char []_jsp_string35;
  private final static char []_jsp_string32;
  private final static char []_jsp_string21;
  private final static char []_jsp_string22;
  private final static char []_jsp_string9;
  private final static char []_jsp_string13;
  private final static char []_jsp_string6;
  private final static char []_jsp_string37;
  private final static char []_jsp_string23;
  private final static char []_jsp_string16;
  private final static char []_jsp_string26;
  private final static char []_jsp_string7;
  private final static char []_jsp_string5;
  private final static char []_jsp_string29;
  private final static char []_jsp_string4;
  private final static char []_jsp_string12;
  private final static char []_jsp_string28;
  private final static char []_jsp_string19;
  private final static char []_jsp_string3;
  private final static char []_jsp_string0;
  private final static char []_jsp_string10;
  static {
    _jsp_string31 = "\r\n</table>\r\n<br />\r\n<center>\r\n<input type='button' value='   *TSQL/PUT/GET \uc9c0\uc6d0 \ucf54\ub4dc \uc0dd\uc131*   ' onClick='tsqlGenForm.submit();' />\r\n</center>\r\n</form>\r\n\r\n\r\n".toCharArray();
    _jsp_string27 = "</td>\r\n	<td bgcolor=\"EAF3F8\">".toCharArray();
    _jsp_string8 = "\r\n\r\n<script type=\"text/javascript\">\r\nwindow.onload = function() {\r\n	// Event Listener Code\r\n	Event.observe('dbName', 'keypress', function(e) { if(e.keyCode == 13) $('tableListForm').submit(); });\r\n	Event.observe('tablePattern', 'keypress', function(e) { if(e.keyCode == 13) $('tableListForm').submit(); });\r\n".toCharArray();
    _jsp_string15 = "\r\n			</SELECT>\r\n			&nbsp;\r\n			<input type='button' value='TABLE \uac80\uc0c9' onClick='searchTableInfo();' />\r\n		</td>\r\n	</tr>\r\n</form>\r\n</table>\r\n".toCharArray();
    _jsp_string2 = "/base/css/cni.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<style tyoe=\"text/css\">\r\n#tableMenuButton {\r\n	cursor: pointer;\r\n	width: 15px;\r\n	height: 15px;\r\n	background-image: url('".toCharArray();
    _jsp_string20 = "' />\r\n".toCharArray();
    _jsp_string24 = "/DB_TABLE_TSQL_GEN.cmd' method='post' onsubmit='return false' target='right'>\r\n<input id=\"tableName\" name='tableName' type='hidden' value='".toCharArray();
    _jsp_string36 = "/DB_TABLE_TSQL_GEN.cmd' method='post' onsubmit='return false' target='right'>\r\n<input id=\"dbName\" name='dbName' type='hidden' />\r\n<input id=\"queryTarget\" name='queryTarget' type='hidden' />\r\n<center>\r\n<input type='button' value='   *PUT/GET \uc9c0\uc6d0 \ucf54\ub4dc \uc0dd\uc131*   ' onClick='tsqlGen();' />\r\n</center>\r\n".toCharArray();
    _jsp_string18 = "</b>\r\n&nbsp;\r\n<input id=\"dbName\" name='dbName' type='hidden' size='25' value='".toCharArray();
    _jsp_string14 = "</OPTION>\r\n			".toCharArray();
    _jsp_string11 = "'/>\r\n			&nbsp;\r\n			<input type='button' value='DB \uc5f0\uacb0\uc815\ubcf4' onClick='searchJdbcInfo();' />\r\n		</td>\r\n	</tr>\r\n	<tr>\r\n		<td align='right'>\r\n			<b>* Table Name </b> : &nbsp; \r\n		</td>\r\n		<td align='left'>\r\n			<input id=\"tablePattern\" name='tablePattern' type='text' size='25' title='\ucc3e\uace0\uc790 \ud558\ub294 Table\uc5d0 \ub300\ud55c \ud328\ud134\uc744 \uc785\ub825\ud558\uc138\uc694. (\uc608:EX_)' value='".toCharArray();
    _jsp_string25 = "' />\r\n<table width=\"100%\" border=\"0\" cellpadding=\"2\" cellspacing=\"1\" bgcolor=\"#B5D5E2\">\r\n	<tr>\r\n	<td bgcolor=\"EAF3F8\">#</td>\r\n	<td bgcolor=\"EAF3F8\">\uceec\ub7fc\uba85</td>\r\n	<td bgcolor=\"EAF3F8\">\ud0c0\uc785</td>\r\n	<td bgcolor=\"EAF3F8\">\ud06c\uae30</td>\r\n	<td bgcolor=\"EAF3F8\">\uc18c\uc218\uc810</td>\r\n	<td bgcolor=\"EAF3F8\">IS PK</td>\r\n	<td bgcolor=\"EAF3F8\">IS NULL</td>\r\n	<td bgcolor=\"EAF3F8\"><input id=\"allCheck\" name='allCheck' type='checkbox' checked onclick='checkAll();'/></td>\r\n	</tr>\r\n".toCharArray();
    _jsp_string34 = "'/>&nbsp;[DS FW Alias]\r\n<br>\r\n<b>* PageSize : </b><input id=\"pgSize\" name='pgSize' type='input' value='20' size='2' value='".toCharArray();
    _jsp_string1 = "\r\n\r\n\r\n<!-- ###### stylesheet area ###### -->\r\n\r\n<link href=\"".toCharArray();
    _jsp_string30 = "' checked /></td>\r\n	</tr>\r\n\r\n".toCharArray();
    _jsp_string33 = "/DB_TABLE_BASIC_R2.cmd' method='post' onsubmit='return false' target='right'>\r\n<br>\r\n<br>\r\n<b>======================== \uc784\uc758 QUERY =======================</b>\r\n<br>\r\n<br>\r\n<b>* DataBase : </b><input id=\"dbName\" name='dbName' type='text' size='25' value='".toCharArray();
    _jsp_string17 = "/DB_TABLE_BASIC_R2.cmd' method='post' onsubmit='return false' target='right'>\r\nTABLE \uba85 : <b>".toCharArray();
    _jsp_string35 = "' />\uac74 &nbsp;&nbsp;&nbsp;\r\n<input type='button' value='Sample \uc870\ud68c' onClick='tableViewForm.submit();' />\r\n\r\n<br>\r\n<textarea id=\"queryTarget\" name='queryTarget' rows=\"20\" cols=\"57\"></textarea>\r\n</form>\r\n<SCRIPT>\r\n	function tsqlGen() {\r\n		window.document.tsqlGenForm.dbName.value = window.document.tableViewForm.dbName.value;\r\n		window.document.tsqlGenForm.queryTarget.value  = window.document.tableViewForm.queryTarget.value;\r\n		window.document.tsqlGenForm.submit();\r\n	}\r\n</SCRIPT>\r\n<form id='tsqlGenForm' name='tsqlGenForm' action='".toCharArray();
    _jsp_string32 = "\r\n<form id='tableViewForm' name='tableViewForm' action='".toCharArray();
    _jsp_string21 = "\r\n<input id=\"colName\" name='colName' type='hidden' value='".toCharArray();
    _jsp_string22 = "\r\n<input id=\"pgSize\" name='pgSize' type='input' value='20' size='2' value='".toCharArray();
    _jsp_string9 = "\r\n	Event.observe('pgSize', 'keypress', function(e) { if(e.keyCode == 13) $('tableViewForm').submit(); });\r\n".toCharArray();
    _jsp_string13 = "\r\n				<OPTION ".toCharArray();
    _jsp_string6 = "\r\n<script>\r\n		alert(\"".toCharArray();
    _jsp_string37 = "\r\n\r\n\r\n".toCharArray();
    _jsp_string23 = "' />\uac74 &nbsp;\r\n<input type='button' value='Sample \uc870\ud68c' onClick='tableViewForm.submit();' />\r\n</form>\r\n<form id='tsqlGenForm' name='tsqlGenForm' action='".toCharArray();
    _jsp_string16 = "\r\n\r\n<SCRIPT LANGUAGE=\"JavaScript\">\r\n<!--\r\n function checkAll() {\r\n  	for(i=0;i<document.getElementsByName(\"colName\").length;i++) {\r\n    	document.getElementsByName(\"colName\")[i].checked=document.getElementsByName(\"allCheck\")[0].checked\r\n    }\r\n    \r\n }   \r\n//-->\r\n</SCRIPT>\r\n<br>\r\n<br>\r\n<form id='tableViewForm' name='tableViewForm' action='".toCharArray();
    _jsp_string26 = "\r\n	<tr>\r\n	<td bgcolor=\"EAF3F8\">".toCharArray();
    _jsp_string7 = "\");\r\n		history.go(-1);\r\n</script>\r\n".toCharArray();
    _jsp_string5 = "/base/js/scriptaculous.js\"></script>\r\n\r\n".toCharArray();
    _jsp_string29 = "</td>\r\n	<td bgcolor=\"#FFFFFF\"><input id=\"colName\" name='colName' type='checkbox' value='".toCharArray();
    _jsp_string4 = "/base/js/prototype.js\"></script>\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    _jsp_string12 = "' />\r\n		</td>\r\n	</tr>\r\n	<tr>\r\n		<td align='right'>\r\n			<b>* Table \uc120\ud0dd</b> : &nbsp;  \r\n		</td>\r\n		<td align='left'>\r\n			<SELECT id=\"tableTarget\" name=\"tableTarget\" style=\"width:187px;\" onchange='searchTableInfo()'>\r\n			".toCharArray();
    _jsp_string28 = "</td>\r\n	<td bgcolor=\"#FFFFFF\">".toCharArray();
    _jsp_string19 = "' />\r\n<input id=\"tableTarget\" name='tableTarget' type='hidden' value='".toCharArray();
    _jsp_string3 = "/base/img/param.gif');\r\n	background-repeat: no-repeat;\r\n}\r\n\r\n#popupMenuDiv {\r\n	border: 4px #ccccff solid;\r\n	background-color: #ffffff;\r\n	position: absolute;\r\n	left: 135px;\r\n	width: 310px;\r\n	display: none;\r\n}\r\n\r\n.popupMenuButton {\r\n	width: 55px;\r\n	height: 30px;\r\n	cursor: pointer;\r\n}\r\n</style>\r\n<!-- ###### stylesheet area ###### -->\r\n\r\n<script type=\"text/javascript\" src=\"".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
    _jsp_string10 = "\r\n}\r\n\r\n\r\nfunction searchTableInfo() {\r\n	var tbForm = document.getElementById(\"tableListForm\")\r\n	tbForm.action = 'DB_TABLE_LIST.cmd';\r\n	tbForm.target = 'left';\r\n	tbForm.submit();\r\n}\r\n\r\nfunction searchJdbcInfo() {\r\n	var tbForm = document.getElementById(\"tableListForm\")\r\n	tbForm.action = 'DB_JDBC_INFO.cmd';\r\n	tbForm.target = 'right';\r\n	tbForm.submit();\r\n}\r\n</script>\r\n\r\n\r\n\r\n\r\n<table width='100%' border='0' cellpadding='0' cellspacing='0'>\r\n<form id='tableListForm' name='tableListForm' method='post' onsubmit='return false' >\r\n	<tr>\r\n		<td align='right'>\r\n			<b>* DataBase </b> : &nbsp; \r\n		</td>\r\n		<td align='left'>\r\n			<input id=\"dbName\" name='dbName' type='text' size='25' title='FW\uc5d0 \uc124\uc815\ud55c DB Alias\ub97c \uc785\ub825\ud558\uc138\uc694. (\ubbf8\uc785\ub825\uc2dc\uc5d0\ub294 MainDB)' value='".toCharArray();
  }
}
