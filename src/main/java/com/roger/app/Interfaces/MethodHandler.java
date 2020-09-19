package com.roger.app.Interfaces;

import java.util.Map;

interface MethodHandler {

	void methodCall(Object[] vars, Map<String, String> headers);

	void methodCall(Object[] vars);

}
