/*
 Copyright (c) 2015 Ahomé Innovation Technologies. All rights reserved.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package com.ait.toolkit.hopscotch.client.jso;

import com.ait.toolkit.core.client.Function;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.core.client.JsArray;
import com.google.gwt.core.client.JsArrayString;
import com.google.gwt.dom.client.Element;

public class StepPeer extends JavaScriptObject {

	protected StepPeer() {

	}

	public static native StepPeer newInstance()/*-{
		return {};
	}-*/;

	public final native void setTitle(String title)/*-{
		this.title = title;
	}-*/;

	public final native void setTarget(String target)/*-{
		this.target = target;
	}-*/;

	public final native void setTarget(Element target)/*-{
		this.target = target;
	}-*/;

	public final native void setTarget(JsArray<Element> target)/*-{
		this.target = target;
	}-*/;

	public final native void setTarget(JsArrayString target)/*-{
		this.target = target;
	}-*/;

	public final native void setContent(String value)/*-{
		this.content = value;
	}-*/;

	public final native void setPlacement(String value)/*-{
		this.placement = value;
	}-*/;

	public final native void onNext(Function callback)/*-{
		this.onNext = $entry(function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

	public final native void onPrev(Function callback)/*-{
		this.onPrev = $entry(function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

	public final native void onShow(Function callback)/*-{
		this.onShow = $entry(function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

	public final native void onCTA(Function callback)/*-{
		this.onCTA = $entry(function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
	}-*/;

}
