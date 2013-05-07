package hype.event;

import hype.interfaces.HLocatable;
import processing.core.PApplet;

public class HMouse implements HLocatable {
	private PApplet _app;
	private int _button;
	private boolean _started, _moved, _clicked, _dragged;
	
	public HMouse(PApplet app) {
		_app = app;
	}
	
	public boolean started() {
		return _started;
	}
	
	public void handleEvents() {
		_button = _app.mouseButton;
		
		if(!_moved) _moved = (_app.pmouseX != 0) || (_app.pmouseY != 0);
		else if(!_started) _started = true;
		
		
	}

	@Override
	public float x() {
		return _app.mouseX;
	}
	
	@Override
	public HMouse x(float newX) {
		return this;
	}

	@Override
	public float y() {
		return _app.mouseY;
	}

	@Override
	public HMouse y(float newY) {
		return this;
	}

	@Override
	public float z() {
		return 0;
	}

	@Override
	public HMouse z(float newZ) {
		return this;
	}
}