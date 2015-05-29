package com.yiqiandai.p2p.web.session.bo;

import com.yiqiandai.p2p.web.user.exception.AuthenticationException;

	public abstract interface Session {
		public abstract String getToken();

		public abstract String getRemoteIP();

		public abstract boolean isAuthenticated();

		public abstract int getAccountId() throws AuthenticationException;

		public abstract String getAttribute(String paramString);

		public abstract void setAttribute(String paramString1, String paramString2);

		public abstract String removeAttribute(String paramString);

		public abstract String getVerifyCode(String paramString);

//		public abstract String getVerifyCode(String paramString, VerifyCodeGenerator paramVerifyCodeGenerator);

		public abstract void invalidVerifyCode(String paramString);

//		public abstract void authenticateVerifyCode(VerifyCodeAuthentication paramVerifyCodeAuthentication)
//				throws AuthenticationException;

//		public abstract int authenticatePassword(PasswordAuthentication paramPasswordAuthentication)
//				throws AuthenticationException;

//		public abstract int checkIn(HttpServletRequest paramHttpServletRequest,
//				HttpServletResponse paramHttpServletResponse, PasswordAuthentication paramPasswordAuthentication)
//				throws AuthenticationException;

//		public abstract void tryAccessResource(String paramString) throws AccesssDeniedException;

		public abstract boolean isAccessableResource(String paramString);

		public abstract boolean isAccessableResource(Class<?> paramClass);

//		public abstract boolean isAccessableResource(Right paramRight);

//		public abstract void invalidate(HttpServletRequest paramHttpServletRequest,
//				HttpServletResponse paramHttpServletResponse);
}
