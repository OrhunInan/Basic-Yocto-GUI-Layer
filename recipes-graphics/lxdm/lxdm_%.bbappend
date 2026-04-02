do_install:append() {
    # Find the [base] section in lxdm.conf and inject the autologin user right below it
    sed -i '/^\[base\]/a autologin=operator' ${D}${sysconfdir}/lxdm/lxdm.conf
}