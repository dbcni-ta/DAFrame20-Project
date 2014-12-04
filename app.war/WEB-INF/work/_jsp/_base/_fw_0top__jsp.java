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
import com.cni.fw.ff.conf.BaseConfig;

public class _fw_0top__jsp extends com.cni.fw.arch.ArchJsp implements com.caucho.jsp.CauchoPage
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
    
	if (BaseConfig.isDevMode()) {

    out.write(_jsp_string2, 0, _jsp_string2.length);
    
	}

    out.write(_jsp_string3, 0, _jsp_string3.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("base/fw_top.jsp"), -6465270970432241300L, false);
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

  private final static char []_jsp_string1;
  private final static char []_jsp_string3;
  private final static char []_jsp_string2;
  private final static char []_jsp_string0;
  static {
    _jsp_string1 = "\r\n\r\n\r\n<html>\r\n<head>\r\n<title>CNI Framework Example</title>\r\n<link href=\"./css/cni.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n<script>\r\n	function chkStat() {\r\n		//if (confirm('\ud604\uc7ac \uc2dc\uc2a4\ud15c\uc5d0 \ub300\ud55c \ud1b5\uacc4\uc815\ubcf4\ub97c \uc870\ud68c\ud569\ub2c8\ub2e4. \uacc4\uc18d \uc9c4\ud589\ud558\uc2dc\uaca0\uc2b5\ub2c8\uae4c?') == true) {\r\n			window.parent.frames[2].location = \"ADM001.A01.cmd\";\r\n			//parent.document.frames[\"right\"].location = \"ADM001.A02.cmd?config=all\";\r\n		//}\r\n	}\r\n\r\n\r\n	function chkReboot() {\r\n		if (confirm('[\uc8fc\uc758!!] \ud504\ub808\uc784\uc6cc\ud06c\ub97c \uc7ac\uae30\ub3d9 \ud569\ub2c8\ub2e4. \uacc4\uc18d \uc9c4\ud589\ud558\uc2dc\uaca0\uc2b5\ub2c8\uae4c?') == true) {\r\n			window.parent.frames[2].location = \"ADM001.A04.cmd\";\r\n			//parent.document.frames[\"right\"].location = \"ADM001.A04.cmd\";\r\n		}\r\n	}\r\n</script>\r\n\r\n<body bgcolor=\"#FFFFFF\" leftmargin=\"0\" topmargin=\"0\">\r\n	<table width=\"100%\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n		<tr>\r\n			<td align=left>\r\n				<a href=\"fw_right.jsp\" target=right><img src=\"img/Strategy.jpg\" alt=\"\uac1c\ubc1c\uc790\ub97c \uc6b0\uc120\uc73c\ub85c \uc0dd\uac01\ud558\ub294 Framework\"></a>\r\n				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n				<a href=\"javascript:parent.LeftSlide();\"><img src=\"img/leftFrame.jpg\" alt=\"\uc88c\uce21\ud328\ub110\uc5ec\ub2eb\uae30\"></a>\r\n			</td>\r\n			<td align=right>\r\n				<a href=\"AC_LIST_GRP.cmd\" target=left ><img src=\"img/TestIcon.jpg\" alt=\"UC\ubaa9\ub85d\uc744 \ucd9c\ub825 \ubc0f \ud14c\uc2a4\ud2b8\"></a>\r\n				<a href=\"DB_TABLE_LIST.cmd\" target=left ><img src=\"img/DBTsql.jpg\" alt=\"TSQL \ud15c\ud50c\ub9bf \uc81c\ub108\ub808\uc774\ud130\"></a>\r\n				<a href=\"doc/index.html\" target=right ><img src=\"img/ApiIcon.jpg\" alt=\"\ud504\ub808\uc784\uc6cc\ud06c API \ud655\uc778\"></a>\r\n				<!--  <a href=\"#\" onclick=\"window.open('http://daframe.dongbucni.co.kr/cms/');return false;\" ><img src=\"img/bbs.jpg\" alt=\"\uacf5\uc2dd\ucee4\ubba4\ub2c8\ud2f0\ubc29\ubb38\"></a> -->\r\n				<a href=\"#\" onclick=\"chkStat();\"><img src=\"img/MonIcon.jpg\" alt=\"\ud504\ub808\uc784\uc6cc\ud06c \uc0c1\ud0dc \ubaa8\ub2c8\ud130\ub9c1\"></a>\r\n				<a href=\"ADM001.A07.cmd\"  target=right><img src=\"img/ReloadIcon.jpg\" alt=\"\ud504\ub808\uc784\uc6cc\ud06c \ud658\uacbd \uad6c\uc131\"></a>\r\n".toCharArray();
    _jsp_string3 = "\r\n				&nbsp;\r\n				&nbsp;\r\n			</td>\r\n		</tr>\r\n	</table>\r\n</body>\r\n</html>\r\n".toCharArray();
    _jsp_string2 = "\r\n				<a href=\"#\" onclick=\"chkReboot();\"><img src=\"img/RebootIcon.jpg\" alt=\"\ud504\ub808\uc784\uc6cc\ud06c \uc7ac\uae30\ub3d9\"></a>\r\n".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
  }
}
