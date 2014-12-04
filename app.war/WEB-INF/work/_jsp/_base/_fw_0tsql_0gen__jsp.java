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

public class _fw_0tsql_0gen__jsp extends com.cni.fw.arch.ArchJsp implements com.caucho.jsp.CauchoPage
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
    
	if (output != null) {
		if (output.getCode().equals("GEN-OK")) {

    out.write(_jsp_string3, 0, _jsp_string3.length);
    			
		}
	}

    out.write(_jsp_string4, 0, _jsp_string4.length);
    out.print(( output.get("TSQL-Sample") ));
    out.write(_jsp_string5, 0, _jsp_string5.length);
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
    depend = new com.caucho.vfs.Depend(appDir.lookup("base/fw_tsql_gen.jsp"), -5389764168625256701L, false);
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

  private final static char []_jsp_string5;
  private final static char []_jsp_string2;
  private final static char []_jsp_string4;
  private final static char []_jsp_string1;
  private final static char []_jsp_string3;
  private final static char []_jsp_string0;
  static {
    _jsp_string5 = "\r\n</pre>\r\n".toCharArray();
    _jsp_string2 = "/base/css/cni.css\" rel=\"stylesheet\" type=\"text/css\">\r\n\r\n".toCharArray();
    _jsp_string4 = "\r\n\r\n<pre>\r\n".toCharArray();
    _jsp_string1 = "\r\n\r\n\r\n<link href=\"".toCharArray();
    _jsp_string3 = "\r\n<script>\r\n		alert(\"TSQL \uc18c\uc2a4\uc0dd\uc131\uc744 \uc644\ub8cc\ud558\uc600\uc2b5\ub2c8\ub2e4.\");\r\n</script>\r\n".toCharArray();
    _jsp_string0 = "\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n\r\n".toCharArray();
  }
}
