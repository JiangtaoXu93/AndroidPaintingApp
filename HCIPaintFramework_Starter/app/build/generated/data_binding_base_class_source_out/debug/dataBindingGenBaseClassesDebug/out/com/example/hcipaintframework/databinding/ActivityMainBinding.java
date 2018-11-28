package com.example.hcipaintframework.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.example.hcipaintframework.MyCanvasView;

public abstract class ActivityMainBinding extends ViewDataBinding {
  @NonNull
  public final TextView Brush;

  @NonNull
  public final Spinner BrushSize;

  @NonNull
  public final Button ClearAll;

  @NonNull
  public final Button ColorPicker;

  @NonNull
  public final RadioButton CurveShape;

  @NonNull
  public final Switch IsFillIn;

  @NonNull
  public final RadioButton LineShape;

  @NonNull
  public final ConstraintLayout MainLayout;

  @NonNull
  public final RadioButton OvalShape;

  @NonNull
  public final RadioButton RectangleShape;

  @NonNull
  public final RadioGroup ShapeGroup;

  @NonNull
  public final LinearLayout Shapes;

  @NonNull
  public final ToggleButton TogBLine;

  @NonNull
  public final MyCanvasView canvasView;

  protected ActivityMainBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView Brush, Spinner BrushSize, Button ClearAll, Button ColorPicker,
      RadioButton CurveShape, Switch IsFillIn, RadioButton LineShape, ConstraintLayout MainLayout,
      RadioButton OvalShape, RadioButton RectangleShape, RadioGroup ShapeGroup, LinearLayout Shapes,
      ToggleButton TogBLine, MyCanvasView canvasView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.Brush = Brush;
    this.BrushSize = BrushSize;
    this.ClearAll = ClearAll;
    this.ColorPicker = ColorPicker;
    this.CurveShape = CurveShape;
    this.IsFillIn = IsFillIn;
    this.LineShape = LineShape;
    this.MainLayout = MainLayout;
    this.OvalShape = OvalShape;
    this.RectangleShape = RectangleShape;
    this.ShapeGroup = ShapeGroup;
    this.Shapes = Shapes;
    this.TogBLine = TogBLine;
    this.canvasView = canvasView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.hcipaintframework.R.layout.activity_main, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivityMainBinding>inflate(inflater, com.example.hcipaintframework.R.layout.activity_main, null, false, component);
  }

  public static ActivityMainBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivityMainBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivityMainBinding)bind(component, view, com.example.hcipaintframework.R.layout.activity_main);
  }
}
