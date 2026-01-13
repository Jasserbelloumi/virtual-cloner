package multispace.multiapp.clone.view.pro.location.map;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.LocationSettingsResponse;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.skyfishjy.library.RippleBackground;
import java.util.Locale;
import multispace.multiapp.clone.bean.LocationInfo;
import multispace.multiapp.clone.view.pro.location.map.utils.CustomButton;
import multispace.multiapp.clone.view.pro.location.map.utils.CustomTextView;
import o00oOooO.oo0oO0;
import o0OOO0oo.oo0OOoo;
import o0OOoO0.o00oo;
import o0OOooOo.o0O;
import o0Oo00oO.o0O0000O;
import o0Oo0oo0.o0OO0o00;
import o0ooO0O0.oO0O000;
import o0ooO0O0.oO0OO0O;
import o0ooO0O0.oO0Oo0o0;
import org.videolan.libvlc.media.MediaPlayer;
import virtual.camera.app.R;
/* loaded from: classes3.dex */
public class MapActivity extends AppCompatActivity implements OnMapReadyCallback {

    /* renamed from: o0O00  reason: collision with root package name */
    public static final String f6763o0O00 = "MapActivity";

    /* renamed from: o0O00O0  reason: collision with root package name */
    public static boolean f6764o0O00O0;

    /* renamed from: o0  reason: collision with root package name */
    public Location f6765o0;

    /* renamed from: o00ooooO  reason: collision with root package name */
    public GoogleMap f6766o00ooooO;

    /* renamed from: o00ooooo  reason: collision with root package name */
    public FusedLocationProviderClient f6767o00ooooo;

    /* renamed from: o0O000  reason: collision with root package name */
    public RippleBackground f6768o0O000;

    /* renamed from: o0O00000  reason: collision with root package name */
    public LocationCallback f6769o0O00000;

    /* renamed from: o0O0000o  reason: collision with root package name */
    public View f6771o0O0000o;

    /* renamed from: o0O000O  reason: collision with root package name */
    public CustomTextView f6772o0O000O;

    /* renamed from: o0O000Oo  reason: collision with root package name */
    public ImageView f6773o0O000Oo;

    /* renamed from: o0O000o0  reason: collision with root package name */
    public LatLng f6775o0O000o0;

    /* renamed from: o0OoOoOO  reason: collision with root package name */
    public String f6777o0OoOoOO;

    /* renamed from: o0OoOoOo  reason: collision with root package name */
    public ProgressBar f6778o0OoOoOo;

    /* renamed from: o0O0000O  reason: collision with root package name */
    public final float f6770o0O0000O = 16.0f;

    /* renamed from: o0O000o  reason: collision with root package name */
    public String[] f6774o0O000o = new String[0];

    /* renamed from: o0ooOoOO  reason: collision with root package name */
    public String f6779o0ooOoOO = o00oo.o00oOOo0(new byte[]{-110, 55}, new byte[]{-9, 89, -60, o0OO0o00.f16655o00oOoOO, -119, 96, -120, 111});

    /* renamed from: o0O000oo  reason: collision with root package name */
    public String f6776o0O000oo = null;

    /* loaded from: classes3.dex */
    public class o00oOOo0 implements Runnable {

        /* renamed from: o00oo0O0  reason: collision with root package name */
        public final /* synthetic */ View f6781o00oo0O0;

        public o00oOOo0(View view) {
            this.f6781o00oo0O0 = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            MapActivity.this.o0O0OOoO(this.f6781o00oo0O0);
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOOoO implements View.OnClickListener {
        public o00oOOoO() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            MapActivity.this.o0OooO0();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo00 implements OnSuccessListener<LocationSettingsResponse> {
        public o00oOo00() {
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        /* renamed from: o00oOOo0 */
        public void onSuccess(LocationSettingsResponse locationSettingsResponse) {
            MapActivity.this.o0O0OOO0();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOo0O implements OnFailureListener {
        public o00oOo0O() {
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public void onFailure(@oo0oO0 Exception exc) {
            if (exc instanceof ResolvableApiException) {
                try {
                    ((ResolvableApiException) exc).startResolutionForResult(MapActivity.this, 51);
                } catch (IntentSender.SendIntentException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oOoO implements GoogleMap.OnCameraIdleListener {
        public o00oOoO() {
        }

        @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
        public void onCameraIdle() {
            MapActivity.this.f6773o0O000Oo.setVisibility(8);
            MapActivity.this.f6778o0OoOoOo.setVisibility(0);
            String str = MapActivity.f6763o0O00;
            o00oo.o00oOOo0(new byte[]{oo0OOoo.f13516o00oOoO, -124, 100, 122, -65, 76, 94, 115, 126, -115, 97, 112, -86, SignedBytes.MAX_POWER_OF_TWO, 67, 103}, new byte[]{94, -20, 5, Ascii.DC4, -40, 37, 48, Ascii.DC4});
            MapActivity.this.o0O0OOoo();
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo0 implements Runnable {

        /* loaded from: classes3.dex */
        public class o00oOOo0 implements OnCompleteListener<Location> {

            /* renamed from: multispace.multiapp.clone.view.pro.location.map.MapActivity$o00oo0$o00oOOo0$o00oOOo0  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public class C0095o00oOOo0 extends LocationCallback {
                public C0095o00oOOo0() {
                }

                @Override // com.google.android.gms.location.LocationCallback
                public void onLocationResult(LocationResult locationResult) {
                    super.onLocationResult(locationResult);
                    if (locationResult == null) {
                        return;
                    }
                    MapActivity.this.f6765o0 = locationResult.getLastLocation();
                    MapActivity.this.f6766o00ooooO.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(MapActivity.this.f6765o0.getLatitude(), MapActivity.this.f6765o0.getLongitude()), 16.0f));
                    MapActivity mapActivity = MapActivity.this;
                    mapActivity.f6767o00ooooo.removeLocationUpdates(mapActivity.f6769o0O00000);
                }
            }

            public o00oOOo0() {
            }

            @Override // com.google.android.gms.tasks.OnCompleteListener
            public void onComplete(@oo0oO0 Task<Location> task) {
                if (MapActivity.this.f6765o0 != null) {
                    return;
                }
                if (!task.isSuccessful()) {
                    Toast.makeText(MapActivity.this, o00oo.o00oOOo0(new byte[]{90, Ascii.ESC, 82, 49, -73, 76, -29, -12, 96, 85, 84, 54, -81, 9, -81, -31, 124, 1, 19, 63, -76, 74, -94, -12, 102, Ascii.SUB, 93, 115}, new byte[]{Ascii.SI, 117, 51, 83, -37, 41, -61, Byte.MIN_VALUE}), 0).show();
                    return;
                }
                MapActivity.this.f6765o0 = task.getResult();
                MapActivity mapActivity = MapActivity.this;
                if (mapActivity.f6765o0 != null) {
                    mapActivity.f6766o00ooooO.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(MapActivity.this.f6765o0.getLatitude(), MapActivity.this.f6765o0.getLongitude()), 16.0f));
                    return;
                }
                LocationRequest create = LocationRequest.create();
                create.setInterval(1000L);
                create.setFastestInterval(5000L);
                create.setPriority(100);
                MapActivity.this.f6769o0O00000 = new C0095o00oOOo0();
                MapActivity.this.f6767o00ooooo.requestLocationUpdates(create, null);
            }
        }

        public o00oo0() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (MapActivity.this.f6765o0 == null) {
                MapActivity.this.f6767o00ooooo.getLastLocation().addOnCompleteListener(new o00oOOo0());
            }
        }
    }

    /* loaded from: classes3.dex */
    public class o00oo00O extends LocationCallback {
        public o00oo00O() {
        }

        @Override // com.google.android.gms.location.LocationCallback
        public void onLocationResult(LocationResult locationResult) {
            super.onLocationResult(locationResult);
            if (locationResult == null) {
                return;
            }
            MapActivity.this.f6765o0 = locationResult.getLastLocation();
            MapActivity.this.f6766o00ooooO.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(MapActivity.this.f6765o0.getLatitude(), MapActivity.this.f6765o0.getLongitude()), 16.0f));
            MapActivity mapActivity = MapActivity.this;
            mapActivity.f6767o00ooooo.removeLocationUpdates(mapActivity.f6769o0O00000);
        }
    }

    public final void o0O0OOO() {
        try {
            this.f6779o0ooOoOO = Locale.getDefault().getLanguage();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void o0O0OOO0() {
        LocationInfo o00oOOoO2 = o0O.o00oOo00().o00oOOoO(this.f6776o0O000oo);
        if (o00oOOoO2 != null && o00oOOoO2.o00oOOoO() != 0.0d && o00oOOoO2.o00oOo00() != 0.0d) {
            double[] o00oOo0O2 = o0O0000O.o00oOo0O(o00oOOoO2.o00oOOoO(), o00oOOoO2.o00oOo00());
            this.f6766o00ooooO.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(o00oOo0O2[0], o00oOo0O2[1]), 16.0f));
            return;
        }
        LocationRequest create = LocationRequest.create();
        create.setInterval(1000L);
        create.setFastestInterval(5000L);
        create.setPriority(100);
        this.f6769o0O00000 = new o00oo00O();
        this.f6767o00ooooo.requestLocationUpdates(create, null);
        oO0OO0O.o00oOo0o(new o00oo0(), 5000L);
    }

    public final void o0O0OOOo() {
        this.f6767o00ooooo = LocationServices.getFusedLocationProviderClient((Activity) this);
        MapFragment mapFragment = (MapFragment) getFragmentManager().findFragmentById(R.id.map_fragment);
        mapFragment.getMapAsync(this);
        this.f6771o0O0000o = mapFragment.getView();
    }

    public final void o0O0OOo() {
        this.f6768o0O000 = (RippleBackground) findViewById(R.id.ripple_bg);
        this.f6772o0O000O = (CustomTextView) findViewById(R.id.tv_display_marker_location);
        this.f6778o0OoOoOo = (ProgressBar) findViewById(R.id.progress_bar);
        this.f6773o0O000Oo = (ImageView) findViewById(R.id.small_pin);
        new Handler().postDelayed(new o00oOOo0(findViewById(R.id.ic_pin)), 1000L);
        ((CustomButton) findViewById(R.id.submit_location_button)).setOnClickListener(new o00oOOoO());
    }

    public final void o0O0OOoO(View view) {
        try {
            int width = view.getWidth() / 2;
            int height = view.getHeight() / 2;
            Animator createCircularReveal = ViewAnimationUtils.createCircularReveal(view, width, height, 0.0f, (float) Math.hypot(width, height));
            view.setVisibility(0);
            createCircularReveal.start();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void o0O0OOoo() {
        LatLng latLng = this.f6766o00ooooO.getCameraPosition().target;
        this.f6775o0O000o0 = latLng;
        if (latLng != null) {
            o0O0Oo0();
        }
    }

    public final void o0O0Oo0() {
        this.f6772o0O000O.setVisibility(0);
        this.f6778o0OoOoOo.setVisibility(8);
        this.f6766o00ooooO.clear();
        this.f6773o0O000Oo.setVisibility(0);
        String str = o00oo.o00oOOo0(new byte[]{100, -40, 6, -122, -100, -12, -43, 109, Ascii.DC2}, new byte[]{40, -71, 114, -17, -24, -127, -79, 8}) + oO0O000.o00oo00O(this.f6775o0O000o0.latitude).o00oOoO0() + o00oo.o00oOOo0(new byte[]{-111, -15, 34, 67, -79, -59, -40, Ascii.ETB, -1, -40, 119}, new byte[]{-101, -67, 77, 45, -42, -84, -84, 98}) + oO0O000.o00oo00O(this.f6775o0O000o0.longitude).o00oOoO0();
        this.f6777o0OoOoOO = str;
        this.f6772o0O000O.setText(str);
    }

    public final void o0OooO0() {
        LatLng latLng = this.f6775o0O000o0;
        if (latLng == null) {
            oO0Oo0o0.o00oOOoO(R.string.empty_empty);
            return;
        }
        double[] o00oOooO2 = o0O0000O.o00oOooO(latLng.latitude, latLng.longitude);
        LocationInfo o00oOOoO2 = o0O.o00oOo00().o00oOOoO(this.f6776o0O000oo);
        if (o00oOOoO2 == null) {
            o00oOOoO2 = new LocationInfo(o00oOooO2[0], o00oOooO2[1]);
        } else {
            o00oOOoO2.o00oOoO0(o00oOooO2[0]);
            o00oOOoO2.o00oOoO(o00oOooO2[1]);
        }
        o00oOOoO2.o00oOo0o(true);
        o0O.o00oOo00().o00oOoo0(this.f6776o0O000oo, o00oOOoO2);
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 51 && i2 == -1) {
            o0O0OOO0();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_map);
        String stringExtra = getIntent().getStringExtra(o00oo.o00oOOo0(new byte[]{6, 117, 107, -12, Ascii.DLE, 47, -46}, new byte[]{103, 5, Ascii.ESC, -85, 96, 68, -75, -101}));
        this.f6776o0O000oo = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            oO0Oo0o0.o00oOoO(o00oo.o00oOOo0(new byte[]{-12, -23, -51, 42, -127, Ascii.FF, -59, 57, -8, -23, -55, 115}, new byte[]{-107, -103, -67, 10, -24, Byte.MAX_VALUE, -27, 92}));
            finish();
        }
        o0O0OOO();
        o0O0OOo();
        o0O0OOOo();
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    @SuppressLint({"MissingPermission"})
    public void onMapReady(GoogleMap googleMap) {
        this.f6766o00ooooO = googleMap;
        googleMap.setMyLocationEnabled(true);
        this.f6766o00ooooO.getUiSettings().setMyLocationButtonEnabled(true);
        this.f6766o00ooooO.getUiSettings().setCompassEnabled(false);
        View view = this.f6771o0O0000o;
        if (view != null && view.findViewById(Integer.parseInt(o00oo.o00oOOo0(new byte[]{123}, new byte[]{74, -50, 63, Ascii.DC4, 123, 111, -14, 111}))) != null) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) ((View) this.f6771o0O0000o.findViewById(Integer.parseInt(o00oo.o00oOOo0(new byte[]{7}, new byte[]{54, Ascii.FF, -3, -104, -96, -97, 51, Ascii.RS}))).getParent()).findViewById(Integer.parseInt(o00oo.o00oOOo0(new byte[]{-83}, new byte[]{-97, -36, Ascii.FS, -7, 103, -21, Ascii.CAN, Ascii.NAK}))).getLayoutParams();
            layoutParams.addRule(10, 0);
            layoutParams.addRule(12, -1);
            layoutParams.setMargins(0, 0, 60, MediaPlayer.MEDIA_INFO_VIDEO_TRACK_LAGGING);
        }
        LocationRequest create = LocationRequest.create();
        create.setInterval(1000L);
        create.setFastestInterval(5000L);
        create.setPriority(100);
        Task<LocationSettingsResponse> checkLocationSettings = LocationServices.getSettingsClient((Activity) this).checkLocationSettings(new LocationSettingsRequest.Builder().addLocationRequest(create).build());
        checkLocationSettings.addOnSuccessListener(new o00oOo00());
        checkLocationSettings.addOnFailureListener(new o00oOo0O());
        this.f6766o00ooooO.setOnCameraIdleListener(new o00oOoO());
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        f6764o0O00O0 = true;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        f6764o0O00O0 = false;
    }
}
