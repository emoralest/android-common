package org.solovyev.android.fragments;

/**
 * Marker interface, fragment implementing this interface will be detached (and NOT removed)
 * from fragment manager. This means that next time fragment will not be created but reused.
 * See {@link MultiPaneFragmentManager} for more details
 */
public interface DetachableFragment {
}
