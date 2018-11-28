package com.example.hcipaintframework.databinding;
import com.example.hcipaintframework.R;
import com.example.hcipaintframework.BR;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ActivityMainBindingImpl extends ActivityMainBinding  {

    @Nullable
    private static final android.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.canvasView, 1);
        sViewsWithIds.put(R.id.TogBLine, 2);
        sViewsWithIds.put(R.id.ClearAll, 3);
        sViewsWithIds.put(R.id.Brush, 4);
        sViewsWithIds.put(R.id.BrushSize, 5);
        sViewsWithIds.put(R.id.ColorPicker, 6);
        sViewsWithIds.put(R.id.IsFillIn, 7);
        sViewsWithIds.put(R.id.Shapes, 8);
        sViewsWithIds.put(R.id.ShapeGroup, 9);
        sViewsWithIds.put(R.id.LineShape, 10);
        sViewsWithIds.put(R.id.CurveShape, 11);
        sViewsWithIds.put(R.id.RectangleShape, 12);
        sViewsWithIds.put(R.id.OvalShape, 13);
    }
    // views
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ActivityMainBindingImpl(@Nullable android.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 14, sIncludes, sViewsWithIds));
    }
    private ActivityMainBindingImpl(android.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.TextView) bindings[4]
            , (android.widget.Spinner) bindings[5]
            , (android.widget.Button) bindings[3]
            , (android.widget.Button) bindings[6]
            , (android.widget.RadioButton) bindings[11]
            , (android.widget.Switch) bindings[7]
            , (android.widget.RadioButton) bindings[10]
            , (android.support.constraint.ConstraintLayout) bindings[0]
            , (android.widget.RadioButton) bindings[13]
            , (android.widget.RadioButton) bindings[12]
            , (android.widget.RadioGroup) bindings[9]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.ToggleButton) bindings[2]
            , (com.example.hcipaintframework.MyCanvasView) bindings[1]
            );
        this.MainLayout.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x1L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
            return variableSet;
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        // batch finished
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): null
    flag mapping end*/
    //end
}