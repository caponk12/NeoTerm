package io.neoterm.ui.term.tab

import io.neoterm.frontend.session.xorg.XSession

/**
 * @author kiva
 */
class XSessionTab(title: CharSequence) : NeoTab(title) {
    var session: XSession? = null
}