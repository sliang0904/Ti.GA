/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2013 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package ti.googleanalytics;

import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Logger.LogLevel;
import com.google.analytics.tracking.android.Tracker;

@Kroll.module(name = "Googleanalytics", id = "ti.googleanalytics")
public class GoogleanalyticsModule extends KrollModule {

	private GoogleAnalytics instance() {
		return GoogleAnalytics.getInstance(this.getActivity());
	}

	@Kroll.method
	public void closeTracker(String trackingId) {
		instance().closeTracker(trackingId);
	}

	@Kroll.method
	@Kroll.getProperty
	public TrackerProxy getDefaultTracker() {
		return new TrackerProxy(instance().getDefaultTracker());
	}

	@Kroll.method
	@Kroll.setProperty
	public void setDefaultTracker(TrackerProxy tracker) {
		instance().setDefaultTracker(tracker.getTracker());
	}

	@Kroll.method
	@Kroll.getProperty
	public TrackerProxy getTracker(String trackingName, String trackingId) {
		return new TrackerProxy(instance().getTracker(trackingName, trackingId));
	}

	@Kroll.method
	@Kroll.getProperty
	public TrackerProxy getTracker(String trackingId) {
		return new TrackerProxy(instance().getTracker(trackingId));
	}

	@Kroll.method
	@Kroll.getProperty
	public boolean getDryRun() {
		return instance().isDryRunEnabled();
	}

	@Kroll.method
	@Kroll.setProperty
	public void setDryRun(boolean dryRun) {
		instance().setDryRun(dryRun);
	}

	@Kroll.method
	@Kroll.getProperty
	public boolean getOptOut() {
		return instance().getAppOptOut();
	}

	@Kroll.method
	@Kroll.setProperty
	public void setOptOut(boolean optOut) {
		instance().setAppOptOut(optOut);
	}

	@Kroll.method
	@Kroll.getProperty
	public MapBuilderProxy getMapBuilder() {
		return new MapBuilderProxy();
	}

	@Kroll.method
	@Kroll.getProperty
	public FieldsProxy getFields() {
		return new FieldsProxy();
	}

}