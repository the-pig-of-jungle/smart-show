package com.coder.zzq.smartshow.toast;

import android.widget.Toast;

import com.coder.zzq.smartshow.core.SmartShow;

import static com.coder.zzq.smartshow.toast.ToastTags.TOAST_TAG_SRC;

public class SrcToastVariety extends TextToastVariety {
    public SrcToastVariety() {
        super(TOAST_TAG_SRC);
    }

    @Override
    protected Toast createToast() {
        return Toast.makeText(SmartShow.getContext(), "", Toast.LENGTH_SHORT);
    }
}
