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

import com.ait.toolkit.core.client.JsObject;
import com.ait.toolkit.core.client.JsoHelper;
import com.google.gwt.dom.client.Element;
import com.google.gwt.user.client.ui.Widget;

public class IntroStep extends JsObject {

	public IntroStep() {
		jsObj = JsoHelper.createObject();
	}

	public IntroStep setIntro(String value) {
		JsoHelper.setAttribute(jsObj, "intro", value);
		return this;
	}

	public IntroStep setPosition(TooltipPosition value) {
		JsoHelper.setAttribute(jsObj, "position", value.name().replace("_", "-").toLowerCase());
		return this;
	}

	public IntroStep setElement(String value) {
		JsoHelper.setAttribute(jsObj, "element", "#" + value);
		return this;
	}

	public IntroStep setElement(Element value) {
		JsoHelper.setAttribute(jsObj, "element", value);
		return this;
	}

	public IntroStep setElement(Widget element) {
		return setElement(element.getElement());
	}
}
