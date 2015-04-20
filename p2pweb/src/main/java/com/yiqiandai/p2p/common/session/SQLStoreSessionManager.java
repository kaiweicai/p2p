package com.yiqiandai.p2p.common.session;

import com.dimeng.framework.resource.ResourceAnnotation;

@ResourceAnnotation
public class SQLStoreSessionManager {
//	extends AbstractCookieSessionManager 
//	public SQLStoreSessionManager(ResourceProvider resourceProvider) {
//		super(resourceProvider);
//	}
//
//	protected Session newSession(Cookie cookie, HttpServletRequest request,
//			HttpServletResponse response) {
//		return new SQLStoreSession(cookie, request, response);
//	}
//
//	protected Connection getConnection() throws SQLException,
//			ResourceNotFoundException {
//		SystemDefine systemDefine = this.resourceProvider.getSystemDefine();
//		return ((SQLConnectionProvider) this.resourceProvider
//				.getDataConnectionProvider(SQLConnectionProvider.class,
//						systemDefine.getDataProvider(SessionManager.class)))
//				.getConnection(systemDefine.getSchemaName(SessionManager.class));
//	}
//
//	public void initilize(Connection connection) throws Throwable {
//		super.initilize(connection);
//		Statement stmt = connection.createStatement();
//		Throwable localThrowable2 = null;
//		try {
//			stmt.addBatch("CREATE TABLE IF NOT EXISTS _1030 (F01 int(10) unsigned NOT NULL AUTO_INCREMENT,F02 char(45) NOT NULL,F03 datetime NOT NULL,F04 int(10) unsigned DEFAULT NULL,F05 datetime NOT NULL,F06 varchar(40) NOT NULL,F07 varchar(40) NOT NULL, PRIMARY KEY (F01),UNIQUE KEY F02 (F02) USING HASH, KEY F06 (F06) USING BTREE, KEY F07 (F07) USING BTREE) ENGINE=MEMORY ;");
//
//			stmt.addBatch("CREATE TABLE IF NOT EXISTS _1031 (F01 int(10) unsigned NOT NULL,F02 varchar(20) NOT NULL,F03 varchar(20) NOT NULL,F04 varchar(20) NOT NULL,F05 datetime NOT NULL, PRIMARY KEY (F01,F02)) ENGINE=MEMORY ;");
//
//			stmt.addBatch("CREATE TABLE IF NOT EXISTS _1032 (F01 int(10) unsigned NOT NULL,F02 varchar(60) NOT NULL,F03 varchar(200) DEFAULT NULL,PRIMARY KEY (F01,F02)) ENGINE=MEMORY ;");
//
//			stmt.addBatch("CREATE TABLE IF NOT EXISTS _1033 (F01 int(10) unsigned NOT NULL,F02 text NOT NULL,PRIMARY KEY (F01)) ;");
//			stmt.addBatch("CREATE TABLE IF NOT EXISTS _1034 (F01 int(10) unsigned NOT NULL,PRIMARY KEY (F01)) ;");
//			stmt.addBatch("CREATE TABLE IF NOT EXISTS _1035 (F01 date NOT NULL,F02 int(10) unsigned NOT NULL DEFAULT '0', PRIMARY KEY (F01)) ;");
//			stmt.addBatch("CREATE TABLE IF NOT EXISTS _1036 (F01 date NOT NULL,F02 int(10) unsigned NOT NULL, F03 int(10) unsigned NOT NULL DEFAULT '0', PRIMARY KEY (F01,F02)) ;");
//
//			stmt.addBatch("CREATE TABLE IF NOT EXISTS _1037 (F01 varchar(40) NOT NULL,F02 varchar(40) NOT NULL, F03 int(10) unsigned NOT NULL DEFAULT '0', PRIMARY KEY (F01,F02)) ;");
//
//			stmt.addBatch("DROP PROCEDURE IF EXISTS SP_1030");
//			stmt.addBatch("CREATE PROCEDURE SP_1030() BEGIN DECLARE _current_date DATETIME DEFAULT CURRENT_TIMESTAMP();DELETE _1033 FROM _1033,_1030 WHERE _1033.F01 = _1030.F01 AND _1030.F05 <= _current_date;DELETE _1032 FROM _1032,_1030 WHERE _1032.F01 = _1030.F01 AND _1030.F05 <= _current_date;DELETE _1031 FROM _1031,_1030 WHERE _1031.F01 = _1030.F01 AND _1030.F05 <= _current_date; DELETE FROM _1030 WHERE _1030.F05 <= _current_date;END;");
//			stmt.addBatch("DROP PROCEDURE IF EXISTS SP_1034");
//			stmt.addBatch("CREATE PROCEDURE SP_1034() BEGIN DECLARE _count INT UNSIGNED DEFAULT 0; SELECT COUNT(*) INTO _count FROM _1034;INSERT INTO _1035 SET F01 = CURRENT_DATE(), F02 = _count ON DUPLICATE KEY UPDATE F02 = VALUES(F02);DELETE FROM _1034;END;");
//			stmt.addBatch("DROP PROCEDURE IF EXISTS SP_1036");
//			stmt.addBatch("CREATE PROCEDURE SP_1036() BEGIN DECLARE _count INT UNSIGNED DEFAULT 0; DECLARE _current_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP();SELECT COUNT(*) INTO _count FROM _1030 WHERE F04 IS NOT NULL AND F05 > _current_time;INSERT INTO _1036 SET F01 = DATE(_current_time), F02 = HOUR(_current_time), F03 = _count ON DUPLICATE KEY UPDATE F03 = VALUES(F03);END;");
//
//			stmt.addBatch("CREATE EVENT IF NOT EXISTS `EVT_1030` ON SCHEDULE EVERY 1 HOUR STARTS '2014-01-01 00:00:00' ON COMPLETION PRESERVE ENABLE DO CALL SP_1030()");
//			stmt.addBatch("CREATE EVENT IF NOT EXISTS `EVT_1034_5` ON SCHEDULE EVERY 1 DAY STARTS '2014-01-01 00:00:00' ON COMPLETION PRESERVE ENABLE DO CALL SP_1034()");
//			stmt.addBatch("CREATE EVENT IF NOT EXISTS `EVT_1036` ON SCHEDULE EVERY 1 HOUR STARTS '2014-01-01 00:00:00' ON COMPLETION PRESERVE ENABLE DO CALL SP_1036()");
//			stmt.addBatch("CREATE EVENT IF NOT EXISTS `EVT_1037` ON SCHEDULE EVERY 1 DAY STARTS '2014-01-01 00:00:00' ON COMPLETION PRESERVE ENABLE DO DELETE FROM _1037");
//			stmt.executeBatch();
//		} catch (Throwable localThrowable1) {
//		} finally {
//			if (stmt != null)
//				if (localThrowable2 != null)
//					try {
//						stmt.close();
//					} catch (Throwable x2) {
//						localThrowable2.addSuppressed(x2);
//					}
//				else
//					stmt.close();
//		}
//	}
//	
//	protected class SQLStoreSession extends	AbstractCookieSessionManager.AbstractCookieSession {
//		private long id = 0L;
//		private long expires;
//		JdbcTemplate jdbcTemplate = null;
//		long vistTime = System.currentTimeMillis();
//		public void getSessionFromCookie(Cookie cookie, HttpServletRequest request,
//				HttpServletResponse response){
//			String querySessionByCookieString = "SELECT F01, F04, F05, F06, F07 FROM _1030 WHERE F02 = ?";
//			SqlRowSet rowSet = jdbcTemplate.queryForRowSet(querySessionByCookieString, cookie.getValue());
//			if (rowSet.next()) {
//				this.id = rowSet.getLong(1);
//				this.accountId = rowSet.getInt(2);
//				this.expires = rowSet.getTimestamp(3).getTime();
//			}
//			if (isAuthenticated()) {
//				String updateSessionTimeSql="UPDATE _1030 SET F05 = ? WHERE F01 = ?";
//				jdbcTemplate.update(updateSessionTimeSql, System.currentTimeMillis(),id);
//			} else if (this.id <= 0L) {
//				String insertSessionSQL = "INSERT INTO _1030 SET F02 = ?, F03 = ?, F04 = ?, F05 = ?, F06 = ?, F07 = ? ON DUPLICATE KEY UPDATE F03 = VALUES(F03), F04 = VALUES(F04), F05 = VALUES(F05), F06 = VALUES(F06), F07 = VALUES(F07)";
//				jdbcTemplate.update(insertSessionSQL,cookie.getValue(),new Timestamp(System.currentTimeMillis()),null,new Timestamp(System.currentTimeMillis()+1800000),this.ip,this.userAgentDigest);
//			} else if (this.id > 0L) {
//				
//			}
//		}
//		
//		
//		public SQLStoreSession(Cookie cookie, HttpServletRequest request,
//		HttpServletResponse response) {
////			super(sessionManager, cookie, request, response);
//			try {
//		Connection connection = SQLStoreSessionManager.this
//				.getConnection();
//		Throwable localThrowable8 = null;
//		try {
//			PreparedStatement pstmt = connection
//					.prepareStatement("SELECT F01, F04, F05, F06, F07 FROM _1030 WHERE F02 = ?");
//			Throwable localThrowable9 = null;
//			Throwable localThrowable10;
//			try {
//				pstmt.setString(1, cookie.getValue());
//				ResultSet resultSet = pstmt.executeQuery();
//				localThrowable10 = null;
//				try {
//					if (resultSet.next()) {
//						this.id = resultSet.getLong(1);
//						this.accountId = resultSet.getInt(2);
//						this.expires = resultSet.getTimestamp(3)
//								.getTime();
//					}
//				} catch (Throwable localThrowable1) {
//				} finally {
//					if (resultSet != null)
//						if (localThrowable10 != null)
//							try {
//								resultSet.close();
//							} catch (Throwable x2) {
//								localThrowable10.addSuppressed(x2);
//							}
//						else
//							resultSet.close();
//				}
//			} catch (Throwable localThrowable2) {
//			} finally {
//				if (pstmt != null)
//					if (localThrowable9 != null)
//						try {
//							pstmt.close();
//						} catch (Throwable x2) {
//							localThrowable9.addSuppressed(x2);
//						}
//					else
//						pstmt.close();
//			}
//			if (isAuthenticated()) {
//				PreparedStatement pstmt = connection
//						.prepareStatement("UPDATE _1030 SET F05 = ? WHERE F01 = ?");
//				localThrowable9 = null;
//				try {
//					pstmt.setTimestamp(
//							1,
//							new Timestamp(this.creationTime
//									+ SQLStoreSessionManager.this
//											.getMaxIdleTime()));
//
//					pstmt.setLong(2, this.id);
//					pstmt.executeUpdate();
//				} catch (Throwable localThrowable3) {
//				} finally {
//					if (pstmt != null)
//						if (localThrowable9 != null)
//							try {
//								pstmt.close();
//							} catch (Throwable x2) {
//								localThrowable9.addSuppressed(x2);
//							}
//						else
//							pstmt.close();
//				}
//			} else if (this.id <= 0L) {
//				PreparedStatement preparedStatement = connection
//						.prepareStatement(
//								"INSERT INTO _1030 SET F02 = ?, F03 = ?, F04 = ?, F05 = ?, F06 = ?, F07 = ? ON DUPLICATE KEY UPDATE F03 = VALUES(F03), F04 = VALUES(F04), F05 = VALUES(F05), F06 = VALUES(F06), F07 = VALUES(F07)",
//								1);
//				localThrowable9 = null;
//				try {
//					preparedStatement.setString(1, cookie.getValue());
//					preparedStatement.setTimestamp(2, new Timestamp(
//							this.creationTime));
//
//					preparedStatement.setNull(3, 4);
//					preparedStatement.setTimestamp(
//							4,
//							new Timestamp(this.creationTime
//									+ SQLStoreSessionManager.this
//											.getMaxIdleTime()));
//
//					preparedStatement.setString(5, this.ip);
//					preparedStatement
//							.setString(6, this.userAgentDigest);
//					preparedStatement.execute();
//					ResultSet resultSet = preparedStatement
//							.getGeneratedKeys();
//					localThrowable10 = null;
//					try {
//						if (resultSet.next())
//							this.id = resultSet.getLong(1);
//					} catch (Throwable localThrowable4) {
//					} finally {
//						if (resultSet != null)
//							if (localThrowable10 != null)
//								try {
//									resultSet.close();
//								} catch (Throwable x2) {
//									localThrowable10.addSuppressed(x2);
//								}
//							else
//								resultSet.close();
//					}
//				} catch (Throwable localThrowable5) {
//				} finally {
//					if (preparedStatement != null)
//						if (localThrowable9 != null)
//							try {
//								preparedStatement.close();
//							} catch (Throwable x2) {
//								localThrowable9.addSuppressed(x2);
//							}
//						else
//							preparedStatement.close();
//				}
//				if (this.id > 0L) {
//					PreparedStatement preparedStatement = connection
//							.prepareStatement("INSERT INTO _1033 SET F01 = ?, F02 = ? ON DUPLICATE KEY UPDATE F02 = VALUES(F02)");
//					localThrowable9 = null;
//					try {
//						preparedStatement.setLong(1, this.id);
//						preparedStatement.setString(2, this.userAgent);
//						preparedStatement.execute();
//					} catch (Throwable localThrowable6) {
//					} finally {
//						if (preparedStatement != null)
//							if (localThrowable9 != null)
//								try {
//									preparedStatement.close();
//								} catch (Throwable x2) {
//									localThrowable9.addSuppressed(x2);
//								}
//							else
//								preparedStatement.close();
//					}
//				}
//			}
//		} catch (Throwable localThrowable7) {
//		} finally {
//			if (connection != null)
//				if (localThrowable8 != null)
//					try {
//						connection.close();
//					} catch (Throwable x2) {
//						localThrowable8.addSuppressed(x2);
//					}
//				else
//					connection.close();
//		}
//	} catch (Throwable throwable) {
//		SQLStoreSessionManager.this.resourceProvider.log(throwable);
//	}
//}
//
//protected void register(int accountId) {
//	try {
//		Connection connection = SQLStoreSessionManager.this
//				.getConnection();
//		Throwable localThrowable4 = null;
//		try {
//			PreparedStatement preparedStatement = connection
//					.prepareStatement("UPDATE _1030 SET F04 = ?, F05 = ? WHERE F01 = ?");
//			Throwable localThrowable5 = null;
//			try {
//				preparedStatement.setInt(1, accountId);
//				preparedStatement.setTimestamp(
//						2,
//						new Timestamp(System.currentTimeMillis()
//								+ SQLStoreSessionManager.this
//										.getMaxIdleTime()));
//
//				preparedStatement.setLong(3, this.id);
//				preparedStatement.execute();
//			} catch (Throwable localThrowable1) {
//			} finally {
//				if (preparedStatement != null)
//					if (localThrowable5 != null)
//						try {
//							preparedStatement.close();
//						} catch (Throwable x2) {
//							localThrowable5.addSuppressed(x2);
//						}
//					else
//						preparedStatement.close();
//			}
//			PreparedStatement preparedStatement = connection
//					.prepareStatement("INSERT IGNORE INTO _1034 SET F01 = ?");
//			localThrowable5 = null;
//			try {
//				preparedStatement.setInt(1, accountId);
//				preparedStatement.execute();
//			} catch (Throwable localThrowable2) {
//			} finally {
//				if (preparedStatement != null)
//					if (localThrowable5 != null)
//						try {
//							preparedStatement.close();
//						} catch (Throwable x2) {
//							localThrowable5.addSuppressed(x2);
//						}
//					else
//						preparedStatement.close();
//			}
//			super.register(accountId);
//		} catch (Throwable localThrowable3) {
//		} finally {
//			if (connection != null)
//				if (localThrowable4 != null)
//					try {
//						connection.close();
//					} catch (Throwable x2) {
//						localThrowable4.addSuppressed(x2);
//					}
//				else
//					connection.close();
//		}
//	} catch (SQLException e) {
//		throw new AuthenticationException("注册会话信息失败.", e);
//	}
//}
//
//public boolean isAuthenticated() {
//	return ((this.accountId > 0) && (this.expires > System
//			.currentTimeMillis()));
//}
//
//public void invalidate(HttpServletRequest request,
//		HttpServletResponse response) {
//	super.invalidate(request, response);
//	try {
//		Connection connection = SQLStoreSessionManager.this
//				.getConnection();
//		Throwable localThrowable3 = null;
//		try {
//			PreparedStatement preparedStatement = connection
//					.prepareStatement("UPDATE _1030 SET F04 = NULL WHERE F01 = ?");
//			Throwable localThrowable4 = null;
//			try {
//				preparedStatement.setLong(1, this.id);
//				preparedStatement.executeUpdate();
//			} catch (Throwable localThrowable1) {
//			} finally {
//				if (preparedStatement != null)
//					if (localThrowable4 != null)
//						try {
//							preparedStatement.close();
//						} catch (Throwable x2) {
//							localThrowable4.addSuppressed(x2);
//						}
//					else
//						preparedStatement.close();
//			}
//		} catch (Throwable localThrowable2) {
//		} finally {
//			if (connection != null)
//				if (localThrowable3 != null)
//					try {
//						connection.close();
//					} catch (Throwable x2) {
//						localThrowable3.addSuppressed(x2);
//					}
//				else
//					connection.close();
//		}
//	} catch (Throwable throwable) {
//		SQLStoreSessionManager.this.resourceProvider.log(throwable);
//	}
//}
//
//public String getAttribute(String name) {
//	if (!(StringHelper.isEmpty(name)))
//		try {
//			Connection connection = SQLStoreSessionManager.this
//					.getConnection();
//			Throwable localThrowable4 = null;
//			try {
//				PreparedStatement preparedStatement = connection
//						.prepareStatement("SELECT F03 FROM _1032 WHERE F01 = ? AND F02 = ?");
//
//				Throwable localThrowable5 = null;
//				try {
//					preparedStatement.setLong(1, this.id);
//					preparedStatement.setString(2, name);
//					ResultSet resultSet = preparedStatement
//							.executeQuery();
//					Throwable localThrowable6 = null;
//					try {
//						if (resultSet.next()) {
//							String str = resultSet.getString(1);
//
//							if (resultSet != null)
//								if (localThrowable6 != null)
//									try {
//										resultSet.close();
//									} catch (Throwable x2) {
//										localThrowable6
//												.addSuppressed(x2);
//									}
//								else
//									resultSet.close();
//							if (preparedStatement != null)
//								if (localThrowable5 != null)
//									try {
//										preparedStatement.close();
//									} catch (Throwable x2) {
//										localThrowable5
//												.addSuppressed(x2);
//									}
//								else
//									preparedStatement.close();
//							return str;
//						}
//					} catch (Throwable localThrowable7) {
//					} finally {
//						if (resultSet != null)
//							if (localThrowable6 != null)
//								try {
//									resultSet.close();
//								} catch (Throwable x2) {
//									localThrowable6.addSuppressed(x2);
//								}
//							else
//								resultSet.close();
//					}
//				} catch (Throwable localThrowable2) {
//				} finally {
//					if (preparedStatement != null)
//						if (localThrowable5 != null)
//							try {
//								preparedStatement.close();
//							} catch (Throwable x2) {
//								localThrowable5.addSuppressed(x2);
//							}
//						else
//							preparedStatement.close();
//				}
//			} catch (Throwable localThrowable3) {
//			} finally {
//				if (connection != null)
//					if (localThrowable4 != null)
//						try {
//							connection.close();
//						} catch (Throwable x2) {
//							localThrowable4.addSuppressed(x2);
//						}
//					else
//						connection.close();
//			}
//		} catch (SQLException e) {
//			SQLStoreSessionManager.this.resourceProvider.log(e);
//		}
//
//	return null;
//}
//
//public void setAttribute(String name, String value) {
//	if (StringHelper.isEmpty(name))
//		return;
//	try {
//		Connection connection = SQLStoreSessionManager.this
//				.getConnection();
//		Throwable localThrowable3 = null;
//		try {
//			PreparedStatement preparedStatement = connection
//					.prepareStatement("INSERT INTO _1032 SET F01 = ?, F02 = ?, F03  =? ON DUPLICATE KEY UPDATE F03 = VALUES(F03)");
//
//			Throwable localThrowable4 = null;
//			try {
//				preparedStatement.setLong(1, this.id);
//				preparedStatement.setString(2, name);
//				if (StringHelper.isEmpty(value))
//					preparedStatement.setNull(3, 12);
//				else {
//					preparedStatement.setString(3, value);
//				}
//				preparedStatement.executeUpdate();
//			} catch (Throwable localThrowable1) {
//			} finally {
//				if (preparedStatement != null)
//					if (localThrowable4 != null)
//						try {
//							preparedStatement.close();
//						} catch (Throwable x2) {
//							localThrowable4.addSuppressed(x2);
//						}
//					else
//						preparedStatement.close();
//			}
//		} catch (Throwable localThrowable2) {
//		} finally {
//			if (connection != null)
//				if (localThrowable3 != null)
//					try {
//						connection.close();
//					} catch (Throwable x2) {
//						localThrowable3.addSuppressed(x2);
//					}
//				else
//					connection.close();
//		}
//	} catch (SQLException e) {
//		SQLStoreSessionManager.this.resourceProvider.log(e);
//	}
//}
//
//public String removeAttribute(String name) {
//	if (StringHelper.isEmpty(name)) {
//		return null;
//	}
//	String value = null;
//	try {
//		Connection connection = SQLStoreSessionManager.this
//				.getConnection();
//		Throwable localThrowable5 = null;
//		try {
//			PreparedStatement preparedStatement = connection
//					.prepareStatement("SELECT F03 FROM _1032 WHERE F01 = ? AND F02 = ?");
//			Throwable localThrowable6 = null;
//			try {
//				preparedStatement.setLong(1, this.id);
//				preparedStatement.setString(2, name);
//				ResultSet resultSet = preparedStatement.executeQuery();
//				Throwable localThrowable7 = null;
//				try {
//					if (resultSet.next())
//						value = resultSet.getString(1);
//				} catch (Throwable localThrowable1) {
//				} finally {
//					if (resultSet != null)
//						if (localThrowable7 != null)
//							try {
//								resultSet.close();
//							} catch (Throwable x2) {
//								localThrowable7.addSuppressed(x2);
//							}
//						else
//							resultSet.close();
//				}
//			} catch (Throwable localThrowable2) {
//			} finally {
//				if (preparedStatement != null)
//					if (localThrowable6 != null)
//						try {
//							preparedStatement.close();
//						} catch (Throwable x2) {
//							localThrowable6.addSuppressed(x2);
//						}
//					else
//						preparedStatement.close();
//			}
//			if (value != null) {
//				PreparedStatement preparedStatement = connection
//						.prepareStatement("DELETE FROM _1032 WHERE F01 = ? AND F02 = ?");
//				localThrowable6 = null;
//				try {
//					preparedStatement.setLong(1, this.id);
//					preparedStatement.setString(2, name);
//					preparedStatement.executeUpdate();
//				} catch (Throwable localThrowable3) {
//				} finally {
//					if (preparedStatement != null)
//						if (localThrowable6 != null)
//							try {
//								preparedStatement.close();
//							} catch (Throwable x2) {
//								localThrowable6.addSuppressed(x2);
//							}
//						else
//							preparedStatement.close();
//				}
//			}
//		} catch (Throwable localThrowable4) {
//		} finally {
//			if (connection != null)
//				if (localThrowable5 != null)
//					try {
//						connection.close();
//					} catch (Throwable x2) {
//						localThrowable5.addSuppressed(x2);
//					}
//				else
//					connection.close();
//		}
//	} catch (SQLException e) {
//		SQLStoreSessionManager.this.resourceProvider.log(e);
//	}
//	return value;
//}
//
//public String getVerifyCode(String type, VerifyCodeGenerator generator) {
//	if (StringHelper.isEmpty(type)) {
//		return null;
//	}
//	String verifyCode = null;
//	try {
//		Connection connection = SQLStoreSessionManager.this
//				.getConnection();
//		Throwable localThrowable5 = null;
//		try {
//			PreparedStatement preparedStatement = connection
//					.prepareStatement("SELECT F03, F05 FROM _1031 WHERE F01 = ? AND F02 = ?");
//			Throwable localThrowable6 = null;
//			try {
//				preparedStatement.setLong(1, this.id);
//				preparedStatement.setString(2, type);
//				ResultSet resultSet = preparedStatement.executeQuery();
//				Throwable localThrowable7 = null;
//				try {
//					if (resultSet.next()) {
//						String code = resultSet.getString(1);
//						Timestamp expires = resultSet.getTimestamp(2);
//						if (expires.getTime() > System
//								.currentTimeMillis())
//							verifyCode = code;
//					}
//				} catch (Throwable localThrowable1) {
//				} finally {
//					if (resultSet != null)
//						if (localThrowable7 != null)
//							try {
//								resultSet.close();
//							} catch (Throwable x2) {
//								localThrowable7.addSuppressed(x2);
//							}
//						else
//							resultSet.close();
//				}
//			} catch (Throwable localThrowable2) {
//			} finally {
//				if (preparedStatement != null)
//					if (localThrowable6 != null)
//						try {
//							preparedStatement.close();
//						} catch (Throwable x2) {
//							localThrowable6.addSuppressed(x2);
//						}
//					else
//						preparedStatement.close();
//			}
//			if (verifyCode == null) {
//				if (generator == null) {
//					generator = SQLStoreSessionManager.this.DEFAULT_VERIFY_CODE_GENERATOR;
//				}
//				VerifyCode newCode = generator.newVerifyCode();
//				PreparedStatement preparedStatement = connection
//						.prepareStatement("INSERT INTO _1031 SET F01 = ?, F02 = ?, F03 = ?, F04 = ?, F05 = ? ON DUPLICATE KEY UPDATE F03 = VALUES(F03), F04 = VALUES(F04), F05 = VALUES(F05)");
//				localThrowable2 = null;
//				try {
//					preparedStatement.setLong(1, this.id);
//					preparedStatement.setString(2, type);
//					preparedStatement.setString(3,
//							newCode.getDisplayValue());
//
//					preparedStatement.setString(4,
//							newCode.getMatchValue());
//					preparedStatement.setTimestamp(5,
//							new Timestamp(System.currentTimeMillis()
//									+ generator.getTTL()));
//
//					preparedStatement.executeUpdate();
//				} catch (Throwable localThrowable8) {
//				} finally {
//					if (preparedStatement != null)
//						if (localThrowable2 != null)
//							try {
//								preparedStatement.close();
//							} catch (Throwable x2) {
//								localThrowable2.addSuppressed(x2);
//							}
//						else
//							preparedStatement.close();
//				}
//				verifyCode = newCode.getDisplayValue();
//			}
//		} catch (Throwable localThrowable4) {
//		} finally {
//			if (connection != null)
//				if (localThrowable5 != null)
//					try {
//						connection.close();
//					} catch (Throwable x2) {
//						localThrowable5.addSuppressed(x2);
//					}
//				else
//					connection.close();
//		}
//	} catch (SQLException e) {
//		SQLStoreSessionManager.this.resourceProvider.log(e);
//	}
//	return verifyCode;
//}
//
//public void invalidVerifyCode(String type) {
//	if (StringHelper.isEmpty(type))
//		return;
//	try {
//		Connection connection = SQLStoreSessionManager.this
//				.getConnection();
//		Throwable localThrowable3 = null;
//		try {
//			PreparedStatement preparedStatement = connection
//					.prepareStatement("DELETE FROM _1031 WHERE F01 = ? AND F02 = ?");
//			Throwable localThrowable4 = null;
//			try {
//				preparedStatement.setLong(1, this.id);
//				preparedStatement.setString(2, type);
//				preparedStatement.executeUpdate();
//			} catch (Throwable localThrowable1) {
//			} finally {
//				if (preparedStatement != null)
//					if (localThrowable4 != null)
//						try {
//							preparedStatement.close();
//						} catch (Throwable x2) {
//							localThrowable4.addSuppressed(x2);
//						}
//					else
//						preparedStatement.close();
//			}
//		} catch (Throwable localThrowable2) {
//		} finally {
//			if (connection != null)
//				if (localThrowable3 != null)
//					try {
//						connection.close();
//					} catch (Throwable x2) {
//						localThrowable3.addSuppressed(x2);
//					}
//				else
//					connection.close();
//		}
//	} catch (SQLException e) {
//		SQLStoreSessionManager.this.resourceProvider.log(e);
//	}
//}
//
//public void authenticateVerifyCode(
//		VerifyCodeAuthentication authentication)
//		throws AuthenticationException {
//	if (authentication == null) {
//		return;
//	}
//	String verifyCode = authentication.getVerifyCode();
//	if ((verifyCode == null) || (verifyCode.isEmpty())) {
//		throw new AuthenticationException("必须提供校验码.");
//	}
//	String type = authentication.getVerifyCodeType();
//	if (StringHelper.isEmpty(type))
//		throw new AuthenticationException("未指定验证码类型.");
//	try {
//		Connection connection = SQLStoreSessionManager.this
//				.getConnection();
//		Throwable localThrowable5 = null;
//		try {
//			PreparedStatement preparedStatement = connection
//					.prepareStatement("SELECT F04, F05 FROM _1031 WHERE F01 = ? AND F02 = ?");
//			Throwable localThrowable6 = null;
//			try {
//				preparedStatement.setLong(1, this.id);
//				preparedStatement.setString(2, type);
//				ResultSet resultSet = preparedStatement.executeQuery();
//				Throwable localThrowable7 = null;
//				try {
//					if (resultSet.next()) {
//						String code = resultSet.getString(1);
//						Timestamp expires = resultSet.getTimestamp(2);
//						if (expires.getTime() <= System
//								.currentTimeMillis()) {
//							throw new AuthenticationException(
//									"无效的验证码或验证码已过期.");
//						}
//
//						if (verifyCode.equalsIgnoreCase(code)) {
//							PreparedStatement pstmt = connection
//									.prepareStatement("DELETE FROM _1031 WHERE F01 = ? AND F02 = ?");
//							Throwable localThrowable8 = null;
//							try {
//								pstmt.setLong(1, this.id);
//								pstmt.setString(2, type);
//								pstmt.executeUpdate();
//							} catch (Throwable localThrowable1) {
//							} finally {
//								if (pstmt != null)
//									if (localThrowable8 != null)
//										try {
//											pstmt.close();
//										} catch (Throwable x2) {
//											localThrowable8
//													.addSuppressed(x2);
//										}
//									else
//										pstmt.close();
//							}
//						} else {
//							throw new AuthenticationException(
//									"无效的验证码或验证码已过期.");
//						}
//					} else {
//						throw new AuthenticationException(
//								"无效的验证码或验证码已过期.");
//					}
//				} catch (Throwable localThrowable2) {
//				} finally {
//					if (resultSet != null)
//						if (localThrowable7 != null)
//							try {
//								resultSet.close();
//							} catch (Throwable x2) {
//								localThrowable7.addSuppressed(x2);
//							}
//						else
//							resultSet.close();
//				}
//			} catch (Throwable localThrowable3) {
//			} finally {
//				if (preparedStatement != null)
//					if (localThrowable6 != null)
//						try {
//							preparedStatement.close();
//						} catch (Throwable x2) {
//							localThrowable6.addSuppressed(x2);
//						}
//					else
//						preparedStatement.close();
//			}
//		} catch (Throwable localThrowable4) {
//		} finally {
//			if (connection != null)
//				if (localThrowable5 != null)
//					try {
//						connection.close();
//					} catch (Throwable x2) {
//						localThrowable5.addSuppressed(x2);
//					}
//				else
//					connection.close();
//		}
//	} catch (SQLException e) {
//		throw new AuthenticationException("验证码校验失败.", e);
//	}
//}
//
//protected void checkMaxErrorTimes(String accountName)
//		throws AuthenticationException {
//	int maxErrorTimes = SQLStoreSessionManager.this.resourceProvider
//			.getSystemDefine().getMaxErrorTimes();
//
//	if (maxErrorTimes <= 0)
//		return;
//	try {
//		Connection connection = SQLStoreSessionManager.this
//				.getConnection();
//		Throwable localThrowable4 = null;
//		try {
//			PreparedStatement pstmt = connection
//					.prepareStatement("SELECT F03 FROM _1037 WHERE F01 = ? AND F02 = ?");
//			Throwable localThrowable5 = null;
//			try {
//				pstmt.setString(1, accountName);
//				pstmt.setString(2, this.ip);
//				ResultSet resultSet = pstmt.executeQuery();
//				Throwable localThrowable6 = null;
//				try {
//					if ((resultSet.next())
//							&& (resultSet.getInt(1) >= maxErrorTimes))
//						throw new AuthenticationException(
//								"超过登录最大错误限制数,请明天再尝试");
//				} catch (Throwable localThrowable1) {
//				} finally {
//					if (resultSet != null)
//						if (localThrowable6 != null)
//							try {
//								resultSet.close();
//							} catch (Throwable x2) {
//								localThrowable6.addSuppressed(x2);
//							}
//						else
//							resultSet.close();
//				}
//			} catch (Throwable localThrowable2) {
//			} finally {
//				if (pstmt != null)
//					if (localThrowable5 != null)
//						try {
//							pstmt.close();
//						} catch (Throwable x2) {
//							localThrowable5.addSuppressed(x2);
//						}
//					else
//						pstmt.close();
//			}
//		} catch (Throwable localThrowable3) {
//		} finally {
//			if (connection != null)
//				if (localThrowable4 != null)
//					try {
//						connection.close();
//					} catch (Throwable x2) {
//						localThrowable4.addSuppressed(x2);
//					}
//				else
//					connection.close();
//		}
//	} catch (SQLException e) {
//		SQLStoreSessionManager.this.resourceProvider.log(e);
//	}
//}
//
//protected void markError(String accountName) {
//	try {
//		Connection connection = SQLStoreSessionManager.this
//				.getConnection();
//		Throwable localThrowable3 = null;
//		try {
//			PreparedStatement pstmt = connection
//					.prepareStatement("INSERT INTO _1037 SET F01 = ?, F02 = ?, F03 = 1 ON DUPLICATE KEY UPDATE F03 = F03+1");
//			Throwable localThrowable4 = null;
//			try {
//				pstmt.setString(1, accountName);
//				pstmt.setString(2, this.ip);
//				pstmt.execute();
//			} catch (Throwable localThrowable1) {
//			} finally {
//				if (pstmt != null)
//					if (localThrowable4 != null)
//						try {
//							pstmt.close();
//						} catch (Throwable x2) {
//							localThrowable4.addSuppressed(x2);
//						}
//					else
//						pstmt.close();
//			}
//		} catch (Throwable localThrowable2) {
//		} finally {
//			if (connection != null)
//				if (localThrowable3 != null)
//					try {
//						connection.close();
//					} catch (Throwable x2) {
//						localThrowable3.addSuppressed(x2);
//					}
//				else
//					connection.close();
//		}
//	} catch (SQLException e) {
//		SQLStoreSessionManager.this.resourceProvider.log(e);
//	}
//}
//}
}