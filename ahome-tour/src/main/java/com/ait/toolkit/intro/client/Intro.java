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
package com.ait.toolkit.intro.client;

import com.ait.toolkit.core.client.Function;
import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.Util;
import com.google.gwt.core.client.JavaScriptObject;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

public final class Intro extends JsObject {

	private static Intro INSTANCE = null;
	private static boolean isInjected = false;

	private static void inject() {
		if (!isLoaded()) {
			Util.injectStyle(IntroResources.INSTANCE.css());
			Util.injectJs(IntroResources.INSTANCE.lib());
			isInjected = true;
		}
	}

	public static void addRtlSupport() {
		if (isInjected) {
			Util.injectJs(IntroResources.INSTANCE.libRtl());
		}
	}

	public static void addRoyalTheme() {
		if (isInjected) {
			Util.injectStyle(IntroResources.INSTANCE.royalTheme());
		}
	}

	public static void addNazaninTheme() {
		if (isInjected) {
			Util.injectStyle(IntroResources.INSTANCE.nazaninTheme());
		}
	}

	public static void addNassimTheme() {
		if (isInjected) {
			Util.injectStyle(IntroResources.INSTANCE.nassimTheme());
		}
	}

	public static void addDarkTheme() {
		if (isInjected) {
			Util.injectStyle(IntroResources.INSTANCE.darkTheme());
		}
	}

	public static Intro get() {
		inject();
		if (INSTANCE == null) {
			INSTANCE = new Intro();
		}
		return INSTANCE;
	}

	private Intro() {
		jsObj = getPeer();
	}

	/**
	 * The tooltip text of step
	 */
	public Intro setIntro(Element element, String value) {
		element.setAttribute("data-intro", value);
		return this;
	}

	public Intro setIntro(Widget target, String value) {
		return setIntro(target.getElement(), value);
	}

	/**
	 * Optionally define a CSS class for tooltip
	 */
	public Intro setTooltipClass(Element element, String value) {
		element.setAttribute("data-tooltipClass", value);
		return this;
	}

	public Intro setTooltipClass(Widget target, String value) {
		return setTooltipClass(target.getElement(), value);
	}

	/**
	 * Optionally define a CSS class for tooltip
	 */
	public Intro setHighlightClass(Element element, String value) {
		element.setAttribute("data-highlightClass", value);
		return this;
	}

	public Intro setHighlightClass(Widget target, String value) {
		return setHighlightClass(target.getElement(), value);
	}

	/**
	 * Optionally define a CSS class for tooltip
	 */
	public Intro setTooltipPosition(Element element, TooltipPosition value) {
		element.setAttribute("data-position", value.name().toLowerCase());
		return this;
	}

	public Intro setTooltipPosition(Widget target, TooltipPosition value) {
		return setTooltipPosition(target.getElement(), value);
	}

	/**
	 * Optionally define the number (priority) of step
	 */
	public Intro setStep(Element element, Integer value) {
		element.setAttribute("data-step", value.toString());
		return this;
	}

	public Intro setStep(Widget target, Integer value) {
		return setStep(target.getElement(), value);
	}

	public native Intro setOptions(IntroOptions options)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.setOptions(options.@com.ait.toolkit.core.client.JsObject::getJsObj()());
		return this;
	}-*/;

	public native void start()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.start();
	}-*/;

	public native void refresh()/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.refresh();
	}-*/;

	public native Intro onComplete(Function callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.oncomplete(function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
		return this;
	}-*/;

	public native Intro onExit(Function callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer.onexit(function() {
			callback.@com.ait.toolkit.core.client.Function::execute()();
		});
		return this;
	}-*/;

	public native Intro onChange(IntroChangeHandler callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.onchange(function(el) {
					callback.@com.ait.toolkit.intro.client.IntroChangeHandler::onEvent(Lcom/google/gwt/dom/client/Element;)(el);
				});
		return this;
	}-*/;

	public native Intro onBeforeChange(IntroChangeHandler callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.onbeforechange(function(el) {
					callback.@com.ait.toolkit.intro.client.IntroChangeHandler::onEvent(Lcom/google/gwt/dom/client/Element;)(el);
				});
		return this;
	}-*/;

	public native Intro onAfterChange(IntroChangeHandler callback)/*-{
		var peer = this.@com.ait.toolkit.core.client.JsObject::getJsObj()();
		peer
				.onafterchange(function(el) {
					callback.@com.ait.toolkit.intro.client.IntroChangeHandler::onEvent(Lcom/google/gwt/dom/client/Element;)(el);
				});
		return this;
	}-*/;

	private native JavaScriptObject getPeer()/*-{
		return $wnd.introJs();
	}-*/;

	private static native boolean isLoaded()/*-{
		if ($wnd.introJs == null || $wnd.introJs == 'undefined') {
			return false;
		}
		return true;
	}-*/;

}
