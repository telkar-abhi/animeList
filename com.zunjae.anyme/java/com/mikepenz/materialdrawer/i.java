package com.mikepenz.materialdrawer;

import android.view.View;
import android.view.View.OnLongClickListener;

final class i implements OnLongClickListener {
    final /* synthetic */ f a;

    i(f fVar) {
        this.a = fVar;
    }

    public final boolean onLongClick(View view) {
        if (this.a.Q == null) {
            return false;
        }
        view.getTag(R.id.material_drawer_profile_header);
        return this.a.Q.b();
    }
}
