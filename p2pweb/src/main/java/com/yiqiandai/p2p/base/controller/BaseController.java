package com.yiqiandai.p2p.base.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.yiqiandai.p2p.base.model.Paginator;

public abstract class BaseController<T> {
	protected Logger logger = LoggerFactory.getLogger(getClass());
	protected Paginator<T> paginator = new Paginator<T>();
}