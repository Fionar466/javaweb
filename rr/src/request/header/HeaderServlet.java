package request.header;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sun.management.resources.agent;

/**
 * Servlet implementation class HeaderServlet
 */
public class HeaderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//��ȡ�����1�ں�
		String agent = request.getHeader("user-agent");
		System.out.println("header:"+agent);
		String referer = request.getHeader("referer");
		if(referer==null)
		{
			System.out.println("ֱ���ڵ�ַ�������");
		}else if(referer.contains("locahost")){
			System.out.println("���Լ����");
		}else if(referer.contains("192.168.")){
			System.out.println("���ǵ��");
		}else {
			System.out.println("�����ɳ�");
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}