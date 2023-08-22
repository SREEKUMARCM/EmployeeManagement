package com.employeeRegistration;


import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class EmployeeList
 */
@WebServlet("/EmployeeList")
public class EmployeeList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmployeeList() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * String uName = request.getParameter("uname"); String password =
		 * request.getParameter("password"); String email =
		 * request.getParameter("email");
		 */
      //  Member member = new Member(uName, password, email);
         Registerdao rDao = new Registerdao();
      //  List result = rDao.getAllMembers();
        List<Member> memberList = rDao.getAllMembers();
        request.setAttribute("memberList", memberList);
        request.getRequestDispatcher("List.jsp").forward(request, response);
        System.out.println("************");
        System.out.println(memberList);
        
    }


	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
