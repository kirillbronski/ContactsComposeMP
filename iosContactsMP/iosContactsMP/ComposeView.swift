//
//  ComposeView.swift
//  iosContactsMP
//
//  Created by Kirill Bronski on 16.07.2023.
//  Copyright © 2023 orgName. All rights reserved.
//

import UIKit
import shared
import SwiftUI

struct ComposeView: UIViewControllerRepresentable {
    func updateUIViewController(_ uiViewController: UIViewControllerType, context: Context) {

    }

    func makeUIViewController(context: Context) -> some UIViewController {
        MainViewControllerKt.MainViewController()
    }
}
