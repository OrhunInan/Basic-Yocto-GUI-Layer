SUMMARY = "Custom X11 XFCE Image with Chromium and Auto-login"
LICENSE = "MIT"

inherit core-image
inherit extrausers

IMAGE_INSTALL += " \
    packagegroup-core-x11 \
    packagegroup-xfce-base \
    chromium-x11 \
    lxdm \
    sudo \
"

EXTRA_USERS_PARAMS = " \
    useradd -m -G video,audio,tty,sudo -s /bin/sh user; \
    usermod -p '\$6\$bW97jv1jSELxU355\$Ip.5myfZ/AcKuC1be2luwo65cKGjhUg3.jhybky3LREeuzS8ujNXa3fnzbMnrSYLh7xBI0CN6n/xAphO2ComI.' user; \
    usermod -p '\$6\$bW97jv1jSELxU355\$Ip.5myfZ/AcKuC1be2luwo65cKGjhUg3.jhybky3LREeuzS8ujNXa3fnzbMnrSYLh7xBI0CN6n/xAphO2ComI.' root; \
"

PACKAGE_EXCLUDE += "xserver-nodm-init" 